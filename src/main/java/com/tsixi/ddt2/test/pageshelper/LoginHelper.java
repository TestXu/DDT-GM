package com.tsixi.ddt2.test.pageshelper;

import com.tsixi.ddt2.test.pages.LoginPage;
import com.tsixi.ddt2.test.utils.MyWebdriver;
import org.openqa.selenium.WebDriver;

/**
 * DDT2-GM登录页面
 *
 * @Author taoxu
 * @Date 2017/3/13 11:40
 */
public class LoginHelper implements LoginPage {
    private WebDriver driver;
    //    private WaitUnits waitUnits = new WaitUnits(driver,20);
    private MyWebdriver dr;

    public LoginHelper(WebDriver driver) {
        this.driver = driver;
        dr = new MyWebdriver();
        dr.setWebDriver(driver);
        dr.setTimeOut(20);
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
        dr.findElement(NAME_INPUT[0], NAME_INPUT[1]).sendKeys("");
        dr.sleep(1000L);
        dr.findElementClear(NAME_INPUT[0], NAME_INPUT[1]);
        dr.findElement(NAME_INPUT[0], NAME_INPUT[1]).sendKeys(name);
        dr.findElement(PWD_INPUT[0], PWD_INPUT[1]).sendKeys("");
        dr.findElementClear(PWD_INPUT[0], PWD_INPUT[1]);
        dr.findElement(PWD_INPUT[0], PWD_INPUT[1]).sendKeys(pwd);
        dr.findElementClick(SERVER[0], SERVER[1]);
        dr.sleep(1000L);
        dr.findElementClick(TEST_SERVER[0], TEST_SERVER[1]);
        dr.findElementClick(LANGUAGE[0], LANGUAGE[1]);
        dr.sleep(1000L);
        dr.findElementClick(CHINAESE[0], CHINAESE[1]);
        dr.findElementClick(LOGIN_BUTTON[0], LOGIN_BUTTON[1]);
    }


}
