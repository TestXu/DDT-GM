package com.tsixi.ddt2.test.utils;

import com.tsixi.ddt2.test.pages.pageshelper.LoginHelper;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2017/5/15.
 */

/**
 * 正确登录
 */
public class Correct_Login {
    private LoginHelper loginHelper;
    private MyWebdriver dr;
    private WebDriver driver;

    /**
     * 获得一个driver对象
     *
     * @param driver
     */
    public Correct_Login(WebDriver driver) {
        this.driver = driver;
        dr = new MyWebdriver();
        dr.setWebDriver(driver);
        loginHelper = new LoginHelper(driver);
    }

    /**
     * 正确登录流
     */
    public boolean login() {
        try {
            dr.openPage("http://192.168.2.200:8080/GM/");
            System.out.println("----GM工具登录----");
            loginHelper.login("taoxu", "123");
            dr.sleep(2000L);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
