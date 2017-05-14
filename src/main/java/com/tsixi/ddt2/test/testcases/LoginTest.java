package com.tsixi.ddt2.test.testcases;

import com.tsixi.ddt2.test.pages.pageshelper.LoginHelper;
import com.tsixi.ddt2.test.utils.Assertion;
import com.tsixi.ddt2.test.utils.MyWebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 登录页面测试用例
 *
 * @Author taoxu
 * @Date 2017/3/13 17:23
 */
//@Listeners(AssertionListener.class)
public class LoginTest {
    private WebDriver driver;
    private MyWebdriver dr;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        dr = new MyWebdriver();
    }

    @AfterClass
    public void teardown() {
        for (Error error : Assertion.errors) {
            System.out.println(error);
        }
        driver.quit();
    }

    @Test
    public void logintest() {
        LoginHelper loginHelper = new LoginHelper(driver);
        System.out.println("----GM工具登录----");
        // loginHelper.openurl("http://192.168.2.200:8080/GM/");
        loginHelper.openUrl("http://gm.tsixi.cn:8080/GM/");
        loginHelper.login("taoxu", "123");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assertion.verifyEquals(true, driver.getCurrentUrl().contains("index"), "是否跳转成功指定地址：");
    }
}
