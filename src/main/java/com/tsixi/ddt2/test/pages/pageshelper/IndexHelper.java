package com.tsixi.ddt2.test.pages.pageshelper;

import com.tsixi.ddt2.test.pages.pageselement.IndexPage;
import com.tsixi.ddt2.test.utils.MyWebdriver;
import org.openqa.selenium.WebDriver;

/**
 * DDT2-GM主菜单页面
 *
 * @Author taoxu
 * @Date 2017/3/13 15:20
 */
public class IndexHelper {
    private WebDriver driver;
    private MyWebdriver dr;

    public IndexHelper(WebDriver driver) {
        this.driver = driver;
        dr = new MyWebdriver();
        dr.setWebDriver(driver);
        dr.setTimeOut(15);
    }

    /**
     * 执行发奖
     */
    public boolean getReaward() {
        try {
            dr.findElementClick(IndexPage.REAWARD_BUTTON[0], IndexPage.REAWARD_BUTTON[1]);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
