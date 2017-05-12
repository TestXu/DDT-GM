package com.ddt2.test;//import com.ddt2.test.utils.Get_Dom4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class Demo1 {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        BaiduHelper baiduHepleer = new BaiduHelper(driver);
        baiduHepleer.go();
        driver.quit();
    }
}
