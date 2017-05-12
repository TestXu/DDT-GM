package com.ddt2.test.pageshelper;

import com.ddt2.test.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * DDT2-GM登录页面
 */
public class LoginHelper extends LoginPage{
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /**
     * 打开登录页面
     *
     * @param url 登录页面url
     */
    public void openurl(String url) {
        driver.get(url);
    }

    /**
     * 执行登录
     *
     * @param name 用户名
     * @param pwd  密码
     */
    public void login(String name, String pwd) {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(NAMEINPUT)).sendKeys("");
        wait.until(ExpectedConditions.elementToBeClickable(NAMEINPUT)).clear();
        wait.until(ExpectedConditions.elementToBeClickable(NAMEINPUT)).sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(PWDINPUT)).sendKeys("");
        wait.until(ExpectedConditions.elementToBeClickable(PWDINPUT)).clear();
        wait.until(ExpectedConditions.elementToBeClickable(PWDINPUT)).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(SERVER)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(TEST_SERVER)).click();
        wait.until(ExpectedConditions.elementToBeClickable(LANGUAGE)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(CHINAESE)).click();
        wait.until(ExpectedConditions.elementToBeClickable(LOGINBUTTON)).click();
    }
}
