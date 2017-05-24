package com.tsixi.ddt2.test.utils;

import com.tsixi.ddt2.test.base.ExcelData;
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
    private String IP;

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
        new ConfigData().getIpType();
        IP = ConfigData.getIP();
    }

    /**
     * 正确登录流
     */
    public boolean login() {
        String[] yh = ExcelData.getYhData();
        try {
            dr.openPage(IP,"/GM");
            System.out.println("----GM工具登录----");
            loginHelper.login(yh[0], yh[1]);
            dr.sleep(2000L);
            System.out.println("登录测试通过");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
