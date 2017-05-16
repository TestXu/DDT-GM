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
    private String[] TEST_SERVER;

    public RewardHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        dr = new MyWebdriver();
        dr.setWebDriver(driver);
        dr.setTimeOut(15);
        new RewardPage().ServerType();
        TEST_SERVER = RewardPage.getTestServer();
    }

    /**
     * 发奖填写信息
     *
     * @param roleId         角色ID
     * @param instructions 详细说明信息
     */
    public boolean addMessage(String roleId, String instructions) {
        try {
            dr.findElementClick(RewardPage.ZONE_BUTTON[0], RewardPage.ZONE_BUTTON[1]);
            dr.sleep(1000L);
            dr.findElementClick(TEST_SERVER[0], TEST_SERVER[1]);
            if (roleId.equals("无")) {
                dr.findElementClick(RewardPage.ROLE_BUTTONN[0], RewardPage.ROLE_BUTTONN[1]);
                dr.sleep(1000L);
                dr.findElementClick(RewardPage.AROLE[0], RewardPage.AROLE[1]);
            } else {
                dr.findElementSendKeys(RewardPage.ROLE_INPUT[0],RewardPage.ROLE_INPUT[1],roleId);
            }
            dr.findElementClick(RewardPage.REASON_BUTTON[0], RewardPage.REASON_BUTTON[1]);
            dr.findElementClick(RewardPage.REASON_WEI[0], RewardPage.REASON_WEI[1]);
            dr.findElement(RewardPage.INSTRUCTIONS[0], RewardPage.INSTRUCTIONS[1]).sendKeys("");
            dr.findElementClear(RewardPage.INSTRUCTIONS[0], RewardPage.INSTRUCTIONS[1]);
            dr.findElementSendKeys(RewardPage.INSTRUCTIONS[0], RewardPage.INSTRUCTIONS[1], instructions);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 添加奖励
     * @param prop_id 物品id
     * @param prop_num 物品数量
     * @return
     */
    public boolean addProp(String prop_id,String prop_num) {
        try {
            dr.findElementClick(RewardPage.ADDITEMS[0],RewardPage.ADDITEMS[1]);
            dr.sleep(2000L);
            dr.findElementClick(RewardPage.PROP_INPUT[0],RewardPage.PROP_INPUT[1]);
            dr.findElementSendKeys(RewardPage.PROP_INPUT[0],RewardPage.PROP_INPUT[1],"");
            dr.findElementClear(RewardPage.PROP_INPUT[0],RewardPage.PROP_INPUT[1]);
            dr.findElementSendKeys(RewardPage.PROP_INPUT[0],RewardPage.PROP_INPUT[1],prop_id);
            dr.sleep(1000L);
            dr.findElementClick(RewardPage.FIRST_PROP[0],RewardPage.FIRST_PROP[1]);
            dr.sleep(1000L);
            dr.findElementClick(RewardPage.PROP_NUM[0],RewardPage.PROP_NUM[1]);
            dr.findElementSendKeys(RewardPage.PROP_NUM[0],RewardPage.PROP_NUM[1],"");
            dr.findElementClear(RewardPage.PROP_NUM[0],RewardPage.PROP_NUM[1]);
            dr.findElementSendKeys(RewardPage.PROP_NUM[0],RewardPage.PROP_NUM[1],prop_num);
            dr.findElementClick(RewardPage.ACCEPT[0],RewardPage.ACCEPT[1]);
            dr.sleep(2000L);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 执行发奖
     */
    public boolean perform(){
        try {
            dr.findElementClick(RewardPage.PERFORM[0],RewardPage.PERFORM[1]);
            dr.sleep(1500L);
       //     dr.findElementClick(RewardPage.ACCEPT_PERFORM[0],RewardPage.ACCEPT_PERFORM[1]);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
