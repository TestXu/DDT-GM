package com.tsixi.ddt2.test.utils;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 读取Excel
 */
public class Excel {
    private String file;
    public Workbook workbook;
    private InputStream input = null;

    public Excel(String file) {
        this.file = file;
        ClassLoader classLoader = Excel.class.getClassLoader();
        URL resource = classLoader.getResource(file);
        String path = resource.getPath();
        try {
            input = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("打开文件错误");
        }
        //获得一个工作簿对象
        try {
            workbook = new XSSFWorkbook(input);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取Excel文件错误");
        }
    }

    public void close() {
        try {
            input.close();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("关闭文件出错");
        }
    }
}
