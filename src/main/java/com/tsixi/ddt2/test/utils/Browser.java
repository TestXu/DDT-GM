package com.tsixi.ddt2.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Browser {
    private static WebDriver driver;
    /**
     * 打开游览器
     *
     * @param browser 游览器名
     */
    public static WebDriver openBrowser(String browser) {
        try {
            switch (browser) {
                case "firefox":
                    return driver = new FirefoxDriver();
                case "chrome":
                    return driver = new ChromeDriver();
                case "ie":
                    return driver = new InternetExplorerDriver();
                default:
                    throw new RuntimeException("输入的定位类型未在程序中定义，类型为：" + browser);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return driver;
        }
    }
}
