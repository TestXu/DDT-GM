package com.tsixi.ddt2.test.utils;

import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class XMLHelp extends Dom4jTest {
    public XMLHelp(String file) {
        super(file);
    }
    /**
     * 提供一个从xml文件获取element元素集合的方法
     *
     * @return Map集合 通过name获取数组values
     * 数组第一位为类型   第二位为类型值
     */
    private Map<String, String[]> setele() {
        Iterator<Element> elements;
        Map<String, String[]> eles;
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

    /**
     * 获取配置文件数据
     * @return
     */
    private Map<String,String> setConfigData(){
        Iterator<Element> propertys;
        Map configDatas;
        Element property = null;
        configDatas = new HashMap<String,String>();
        //获取根节点元素对象
        Element node = super.document.getRootElement();
        //获得一个element列表迭代器
        propertys = node.elements("property").iterator();
        while (propertys.hasNext()) {
            property = propertys.next();
            configDatas.put(property.attributeValue("name"), property.attributeValue("value"));
        }
        close();
        return configDatas;
    }
    public Map<String,String> getConfigData(){
        return this.setConfigData();
    }
}
