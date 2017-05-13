package com.tsixi.ddt2.test.pageshelper;

import com.tsixi.ddt2.test.pages.RewardPage;
import com.tsixi.ddt2.test.utils.WaitUnits;
import org.openqa.selenium.WebDriver;

/**
 * DDT2-GM发奖页面
 * @Author taoxu
 * @Date 2017/3/13 16:42
 */
public class RewardHelper extends RewardPage{
    private WebDriver driver;
    private WaitUnits waitUnits = new WaitUnits(driver);
    public RewardHelper(WebDriver driver){
        super(driver);
        this.driver = driver;

    }
    /**
     * 发奖填写信息
     * @param role         角色ID
     * @param instructions 详细说明信息
     */
    public void addMessage(String role, String instructions) {
        waitUnits.waitClick(ZONE_BUTTON).click();
        waitUnits.waitClick(TEST_SERVER).click();
        if(role==null){

        }else {
            waitUnits.waitClick(ROLE_BUTTONN).click();
            waitUnits.waitClick(AROLE).click();
        }
        waitUnits.waitClick(REASON_BUTTON).click();
        waitUnits.waitClick(REASON_WEI).click();
        waitUnits.waitClick(INSTRUCTIONS).sendKeys("");
        waitUnits.waitClick(INSTRUCTIONS).clear();
        waitUnits.waitClick(INSTRUCTIONS).sendKeys(instructions);
    }
    public void addProp(){

    }
}
