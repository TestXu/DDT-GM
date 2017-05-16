package com.tsixi.ddt2.test.testcases;

import com.tsixi.ddt2.test.base.ExcelData;
import com.tsixi.ddt2.test.base.ExcelGetAll;
import com.tsixi.ddt2.test.pages.pageshelper.RewardHelper;
import com.tsixi.ddt2.test.utils.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Administrator on 2017/5/15.
 */

/**
 * 发放奖励流程测试
 */
public class RewardTest {
    private WebDriver driver;
    private MyWebdriver dr;
    private Correct_Login login;
    private RewardHelper rewardHelper;
    private List<String> propIds;//物品ID
    private List<String> propNums;//物品数量
    private String roleId;//发放奖励角色ID
    private String instructions;//发放奖励说明详情

    @BeforeClass
    public void setup() {
        new ExcelGetAll("userdata/suju.xlsx").getAll();
        driver = Browser.openBrowser(ConfigData.BROWSER);
        driver.manage().window().maximize();
        dr = new MyWebdriver();
        dr.setWebDriver(driver);
        login = new Correct_Login(driver);
        rewardHelper = new RewardHelper(driver);
        roleId = ExcelData.getRoleId();
        instructions = ExcelData.getInstructions();
        propIds = ExcelData.getPropIds();
        propNums = ExcelData.getPropNums();
    }

    @AfterClass
    public void teardown() {
        for (Error error : Assertion.errors) {
            System.out.println(error);
        }
        dr.endTest();
    }

    @Test
    public void rewardTest() {
        login.login();
        System.out.println("登录测试通过");
        rewardHelper.getReaward();
        System.out.println("GM主页面测试通过");
        rewardHelper.addMessage(roleId, instructions);
        System.out.println("GM发放奖励填写信息通过");
        for (int i = 1; i < propIds.size(); i++) {
            rewardHelper.addProp(propIds.get(i), propNums.get(i));
        }
        System.out.println("GM添加物品信息通过");
        rewardHelper.perform();
    }
}
