package com.ddt2.test.pageshelper;

import com.ddt2.test.pages.RewardPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * DDT2-GM发奖页面
 */
public class RewardHelper extends RewardPage{
    private WebDriver driver;
    private WebDriverWait wait;
    public RewardHelper(WebDriver driver){
        super(driver);
        this.driver = driver;

    }
    /**
     * 发奖填写信息
     * @param role         角色ID
     * @param instructions 详细说明信息
     */
    public void addmessage(String role, String instructions) {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(ZONEBUTTON)).click();
        TEST_SERVER.click();
        if(role==null){

        }else {
            ROLEBUTTONN.click();
            AROLE.click();
        }
        REASONBUTTON.click();
        REASON_WEI.click();
        INSTRUCTIONS.sendKeys("");
        INSTRUCTIONS.clear();
        INSTRUCTIONS.sendKeys(instructions);

    }
}
