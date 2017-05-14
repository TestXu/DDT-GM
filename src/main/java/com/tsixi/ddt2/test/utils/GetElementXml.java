package com.tsixi.ddt2.test.utils;

import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GetElementXml extends Dom4j {
    public GetElementXml(String file) {
        super(file);
    }
    private List<String[]> eles;
    /**
     *
     * @return
     */
    private List<String[]> setele() {
        Iterator<Element> elements;
        Element element = null;
        eles = new ArrayList<String[]>();
        //获取根节点元素对象
        Element node = super.document.getRootElement();
        //获得一个element列表迭代器
        elements = node.elements("element").iterator();
        while (elements.hasNext()) {
            element = elements.next();
            String[] ele =new String[2];
//           Attribute attr = element.attribute("name");
            Element locator = element.element("locator");
            Attribute attr1 = locator.attribute("type");
            ele[0] = attr1.getText();
            ele[1] = locator.getText();
//            System.out.println("用处：" + attr.getText());
//            System.out.println("类型:" + attr1.getText() + "\n" + locator.getText());
//            System.out.println("---------------------------------------");
            eles.add(ele);
        }
        close();
        return eles;
    }

    public List<String[]> getele() {
        return this.setele();
    }
}
