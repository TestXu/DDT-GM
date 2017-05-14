package com.tsixi.ddt2.test.utils;

import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class GetElementXml extends Dom4j {
    public GetElementXml(String file) {
        super(file);
    }

    private Map<String, String[]> eles;

    /**
     * 提供一个从xml文件获取ele数组的方法
     *
     * @return Map集合 通过name获取数组values
     * 数组第一位为类型   第二位为类型值
     */
    private Map<String, String[]> setele() {
        Iterator<Element> elements;
        Element property = null;
        eles = new HashMap<String, String[]>();
        //获取根节点元素对象
        Element node = super.document.getRootElement();
        //获得一个element列表迭代器
        elements = node.elements("property").iterator();
        while (elements.hasNext()) {
            property = elements.next();
            String[] ele = new String[2];
            ele[0] = property.attributeValue("type");
            ele[1] = property.attributeValue("value");
            eles.put(property.attributeValue("name"), ele);
        }
        close();
        return eles;
    }

    /**
     * 提供一个获取element元素集合
     *
     * @return Map集合 通过name获取数组values
     * 数组第一位为类型   第二位为类型值
     */
    public Map<String, String[]> getele() {
        return this.setele();
    }
}
