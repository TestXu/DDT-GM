package com.tsixi.ddt2.test.utils;/**
 * Created by taoxu on 2017/5/13.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 等待通用时间
 * @author taoxu
 * @create 2017-05-13-11:31
 **/
public class WaitUnits {
    private WebDriver driver;
    private WebDriverWait wait;
    public WaitUnits(WebDriver driver,int i){
        this.driver = driver;
        wait =new WebDriverWait(driver,i);
    }
    public WebElement waitClick(WebElement webElement){
       WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(webElement));
       return element;
    }
}
