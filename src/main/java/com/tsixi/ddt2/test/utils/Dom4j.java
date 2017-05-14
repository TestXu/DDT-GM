package com.tsixi.ddt2.test.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class Dom4j {
    private String file;
    public Document document;
    private InputStream input = null;

    /**
     * 提供一个传入文件创建document对象的构造器
     *
     * @param file 文件名
     */
    public Dom4j(String file) {
        this.file = file;
        ClassLoader classLoader = Dom4j.class.getClassLoader();
        URL resource = classLoader.getResource(file);
        String path = resource.getPath();
        try {
            input = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("打开文件错误");
        }
        // 创建saxReader对象
        SAXReader reader = new SAXReader();
        // 通过read方法读取一个文件 转换成Document对象
        try {
            document = reader.read(input);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭文件
     */
    public void close() {
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("关闭文件错误");
        }

    }
}
