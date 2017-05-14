package com.tsixi.ddt2.test.pageshelper;/**
 * Created by taoxu on 2017/5/14.
 */

import com.tsixi.ddt2.test.pages.IDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author taoxu
 * @create 2017-05-14-0:27
 **/
public class IDemohelper implements IDemo {
    public void login(WebDriver driver) {
        driver.findElement(By.id(INDEX_BUTTON)).sendKeys("good");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id(BUTTON)).click();
    }
}
