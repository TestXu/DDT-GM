package com.tsixi.ddt2.test.testcases;

import com.tsixi.ddt2.test.pages.pageshelper.LoginHelper;
import com.tsixi.ddt2.test.utils.Assertion;
import com.tsixi.ddt2.test.utils.Browser;
import com.tsixi.ddt2.test.utils.MyWebdriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 登录页面测试用例
 *
 * @Author taoxu
 * @Date 2017/3/13 17:23
 */
public class LoginTest {
    private WebDriver driver;
    private MyWebdriver dr;
    private LoginHelper loginHelper;
    @BeforeClass
    public void setUp() {
        driver = Browser.openBrowser("chrome");
        dr = new MyWebdriver();
        dr.setWebDriver(driver);
        loginHelper = new LoginHelper(driver);
    }

    @AfterClass
    public void tearDown() {
        for (Error error : Assertion.errors) {
            System.out.println(error);
        }
        dr.endTest();
    }

    /**
     * 正常登录流
     */
    @Test
    public void loginTest1() {
        dr.openPage("http://192.168.2.200:8080/GM/");
        System.out.println("----GM工具登录----");
        loginHelper.login("taoxu", "123");
        dr.sleep(1000L);
        Assert.assertEquals(true, dr.getCurrentUrl().contains("index"), "是否跳转成功指定地址：");
        System.out.println("测试通过");
    }

    /**
     * 异常登录流
     */
    @Test
    public void loginTest2(){
        dr.openPage("http://192.168.2.200:8080/GM/");
        System.out.println("----GM工具登录----");
        loginHelper.login("asda", "12asd3");
        dr.sleep(1000L);
        Assert.assertEquals(false, dr.getCurrentUrl().contains("index"), "是否跳转成功指定地址：");
    }
}
