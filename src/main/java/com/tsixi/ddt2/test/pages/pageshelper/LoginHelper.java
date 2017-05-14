package com.tsixi.ddt2.test.pages.pageshelper;

import com.tsixi.ddt2.test.pages.pageselement.LoginPage;
import com.tsixi.ddt2.test.utils.MyWebdriver;
import org.openqa.selenium.WebDriver;

/**
 * DDT2-GM登录页面
 *
 * @Author taoxu
 * @Date 2017/3/13 11:40
 */
public class LoginHelper {
    private WebDriver driver;
    //    private WaitUnits waitUnits = new WaitUnits(driver,20);
    private MyWebdriver dr;

    public LoginHelper(WebDriver driver) {
        this.driver = driver;
        dr = new MyWebdriver();
        dr.setWebDriver(driver);
        dr.setTimeOut(10);
    }

    /**
     * 打开登录页面
     *
     * @param url 登录页面url
     */
    public void openUrl(String url) {
        driver.get(url);
    }

    /**
     * 执行登录
     *
     * @param name 用户名
     * @param pwd  密码
     */
    public void login(String name, String pwd) {
        dr.findElementSendKeys(LoginPage.NAME_INPUT[0], LoginPage.NAME_INPUT[1], "");
        dr.sleep(1000L);
        dr.findElementClear(LoginPage.NAME_INPUT[0], LoginPage.NAME_INPUT[1]);
        dr.findElementSendKeys(LoginPage.NAME_INPUT[0], LoginPage.NAME_INPUT[1], name);
        dr.findElementSendKeys(LoginPage.PWD_INPUT[0], LoginPage.PWD_INPUT[1], "");
        dr.findElementClear(LoginPage.PWD_INPUT[0], LoginPage.PWD_INPUT[1]);
        dr.findElementSendKeys(LoginPage.PWD_INPUT[0], LoginPage.PWD_INPUT[1], pwd);
        dr.findElementClick(LoginPage.SERVER[0], LoginPage.SERVER[1]);
        dr.sleep(1000L);
        dr.findElementClick(LoginPage.TEST_SERVER[0], LoginPage.TEST_SERVER[1]);
        dr.findElementClick(LoginPage.LANGUAGE_BUTTON[0], LoginPage.LANGUAGE_BUTTON[1]);
        dr.sleep(1000L);
        dr.findElementClick(LoginPage.CHINAESE[0], LoginPage.CHINAESE[1]);
        dr.findElementClick(LoginPage.LOGIN_BUTTON[0], LoginPage.LOGIN_BUTTON[1]);
    }


}
