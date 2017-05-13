package com.tsixi.ddt2.test.utils;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/14.
 */
public class Xml {
    /**
     * 使用DOM的准备工作：
     1、创建DocumentBuilderFactory对象（newInstance方法）

     2、创建DocumentBuilder对象（newDocumentBuilder方法）

     3、DocumentBuilder对象的parse（）方法
     * @param args
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("src/test.xml");
        //创建DocumentBuilderFactory对象
        DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
        //创建DocumentBuilder对象
        DocumentBuilder db = dbf.newDocumentBuilder();
        //通过DocumentBuilder对象的parse方法返回一个Document对象
        Document document = db.parse(file);
        //通过Document对象的getElementsByTagName()返根节点的一个list集合
        NodeList nlis = document.getElementsByTagName("name");
        System.out.println(nlis.item(0).getAttributes().getNamedItem("a").getNodeValue());
    }
}
