package com.tsixi.ddt2.test.pages.pageshelper;

import com.tsixi.ddt2.test.pages.pageselement.RewardPage;
import com.tsixi.ddt2.test.utils.MyWebdriver;
import org.openqa.selenium.WebDriver;

/**
 * DDT2-GM发奖页面
 *
 * @Author taoxu
 * @Date 2017/3/13 16:42
 */
public class RewardHelper extends IndexHelper {
    private WebDriver driver;
    private MyWebdriver dr;

    public RewardHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        dr = new MyWebdriver();
    }

    /**
     * 发奖填写信息
     *
     * @param role         角色ID
     * @param instructions 详细说明信息
     */
    public void addMessage(String role, String instructions) {
        dr.findElementClick(RewardPage.ZONE_BUTTON[0], RewardPage.ZONE_BUTTON[1]);
        dr.findElementClick(RewardPage.TEST_SERVER[0], RewardPage.TEST_SERVER[1]);
        if (role == null) {

        } else {
            dr.findElementClick(RewardPage.ROLE_BUTTONN[0], RewardPage.ROLE_BUTTONN[1]);
            dr.findElementClick(RewardPage.AROLE[0], RewardPage.AROLE[1]);
        }
        dr.findElementClick(RewardPage.REASON_BUTTON[0], RewardPage.REASON_BUTTON[1]);
        dr.findElementClick(RewardPage.REASON_WEI[0], RewardPage.REASON_WEI[1]);
        dr.findElement(RewardPage.INSTRUCTIONS[0], RewardPage.INSTRUCTIONS[1]).sendKeys("");
        dr.findElementClear(RewardPage.INSTRUCTIONS[0], RewardPage.INSTRUCTIONS[1]);
        dr.findElementSendKeys(RewardPage.INSTRUCTIONS[0], RewardPage.INSTRUCTIONS[1], instructions);
    }

    public void addProp() {

    }
}
