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
public class RewardHelper extends IndexHelper implements RewardPage {
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
        dr.findElementClick(ZONE_BUTTON[0], ZONE_BUTTON[1]);
        dr.findElementClick(TEST_SERVER[0], TEST_SERVER[1]);
        if (role == null) {

        } else {
            dr.findElementClick(ROLE_BUTTONN[0], ROLE_BUTTONN[1]);
            dr.findElementClick(AROLE[0], AROLE[1]);
        }
        dr.findElementClick(REASON_BUTTON[0], REASON_BUTTON[1]);
        dr.findElementClick(REASON_WEI[0], REASON_WEI[1]);
        dr.findElement(INSTRUCTIONS[0], INSTRUCTIONS[1]).sendKeys("");
        dr.findElementClear(INSTRUCTIONS[0], INSTRUCTIONS[1]);
        dr.findElement(INSTRUCTIONS[0], INSTRUCTIONS[1]).sendKeys(instructions);
    }

    public void addProp() {

    }
}
