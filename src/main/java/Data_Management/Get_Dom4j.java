package Data_Management;

import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Get_Dom4j extends Dom4j {
    public Get_Dom4j(String file) {
        super(file);
    }

    public void getele() {
        Iterator<Element> elements;
        Element element = null;
        List<String> ele = new ArrayList<String>();
        //获取根节点元素对象
        Element node = super.document.getRootElement();
        //获得一个element列表迭代器
        elements = node.elements("element").iterator();
        while (elements.hasNext()) {
            element = elements.next();
            Attribute attr = element.attribute("name");
            Element locator = element.element("locator");
            Attribute attr1 = locator.attribute("type");
            System.out.println("用处：" + attr.getText());
            System.out.println("类型:" + attr1.getText() + "\n" + locator.getText());
            System.out.println("---------------------------------------");
            ele.add(locator.getText());
        }
    }
}
