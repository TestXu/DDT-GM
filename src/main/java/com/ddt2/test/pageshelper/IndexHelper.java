package com.ddt2.test.pageshelper;

import com.ddt2.test.pages.IndexPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * DDT2-GM主菜单页面
 */
public class IndexHelper extends IndexPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public IndexHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /**
     * 执行发奖
     */
    public void getreaward() {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(REAWARDBUTTON)).click();
    }
}
