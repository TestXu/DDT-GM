package com.ddt2.test.testcases;

import com.ddt2.test.pageshelper.LoginHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/12.
 */
public class LoginTest {
    private WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
    @Test
    public void logintest(){
        LoginHelper loginHelper = new LoginHelper(driver);
        System.out.println("----GM工具登录----");
       // loginHelper.openurl("http://192.168.2.200:8080/GM/");
        loginHelper.openurl("http://gm.tsixi.cn:8080/GM/");
        loginHelper.login("taoxu","123");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Assert.assertTrue(driver.getCurrentUrl().contains("index"));
            System.out.println("登录测试通过");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
