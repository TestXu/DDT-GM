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
public class IndexHelper implements IndexPage {
    private WebDriver driver;
    private MyWebdriver dr;

    public IndexHelper(WebDriver driver) {
        this.driver = driver;
        dr = new MyWebdriver();
    }

    /**
     * 执行发奖
     */
    public void getReaward() {
        dr.findElementClick(REAWARD_BUTTON[0], REAWARD_BUTTON[1]);
    }
}
