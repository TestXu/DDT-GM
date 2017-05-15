package com.tsixi.ddt2.test.testcases;

import com.tsixi.ddt2.test.pages.pageshelper.LoginHelper;
import com.tsixi.ddt2.test.pages.pageshelper.RewardHelper;
import com.tsixi.ddt2.test.utils.Assertion;
import com.tsixi.ddt2.test.utils.Browser;
import com.tsixi.ddt2.test.utils.Correct_Login;
import com.tsixi.ddt2.test.utils.MyWebdriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/15.
 */
public class RewardTest {
    private WebDriver driver;
    private MyWebdriver dr;
    private Correct_Login login;
    private RewardHelper rewardHelper;
    @BeforeClass
    public void setup() {
        driver = Browser.openBrowser("chrome");
        driver.manage().window().maximize();
        dr = new MyWebdriver();
        dr.setWebDriver(driver);
        login = new Correct_Login(driver);
        rewardHelper = new RewardHelper(driver);
    }

    @AfterClass
    public void teardown() {
        for (Error error : Assertion.errors) {
            System.out.println(error);
        }
        dr.endTest();
    }
    @Test
    public void rewardTest(){
        login.login();
        System.out.println("登录测试通过");
        rewardHelper.getReaward();
        System.out.println("GM主页面测试通过");
        rewardHelper.addMessage(null,"aaa");
        System.out.println("GM发放奖励填写信息通过");
        rewardHelper.addProp("296110","111111");
        rewardHelper.perform();
    }
}
