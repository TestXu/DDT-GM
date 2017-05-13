package com.tsixi.ddt2.test.pageshelper;

import com.tsixi.ddt2.test.pages.IndexPage;
import com.tsixi.ddt2.test.utils.WaitUnits;
import org.openqa.selenium.WebDriver;

/**
 * DDT2-GM主菜单页面
 *
 * @Author taoxu
 * @Date 2017/3/13 15:20
 */
public class IndexHelper extends IndexPage {
    private WebDriver driver;
    private WaitUnits waitUnits = new WaitUnits(driver);

    public IndexHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /**
     * 执行发奖
     */
    public void getReaward() {
        waitUnits.waitClick(REAWARD_BUTTON).click();
    }
}
