package com.tsixi.ddt2.test.pageshelper;

import com.tsixi.ddt2.test.pages.LoginPage;
import com.tsixi.ddt2.test.utils.WaitUnits;
import org.openqa.selenium.WebDriver;

/**
 * DDT2-GM登录页面
 *
 * @Author taoxu
 * @Date 2017/3/13 11:40
 */
public class LoginHelper extends LoginPage {
    private WebDriver driver;
    private WaitUnits waitUnits = new WaitUnits(driver);

    public LoginHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
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
        waitUnits.waitClick(NAME_INPUT).sendKeys("");
        waitUnits.waitClick(NAME_INPUT).clear();
        waitUnits.waitClick(NAME_INPUT).sendKeys(name);
        waitUnits.waitClick(PWD_INPUT).sendKeys("");
        waitUnits.waitClick(PWD_INPUT).clear();
        waitUnits.waitClick(PWD_INPUT).sendKeys(pwd);
        waitUnits.waitClick(SERVER).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitUnits.waitClick(TEST_SERVER).click();
        waitUnits.waitClick(LANGUAGE).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitUnits.waitClick(CHINAESE).click();
        waitUnits.waitClick(LOGIN_BUTTON).click();
    }
}
