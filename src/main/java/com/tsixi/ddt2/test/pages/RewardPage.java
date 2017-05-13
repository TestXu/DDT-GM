package com.tsixi.ddt2.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * DDT2-GM发奖页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 16:23
 */
public class RewardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * 获得当前页面元素值
     *
     * @param driver driver对象
     */
    public RewardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[1]/div/div/div[1]/input")
    protected static WebElement ZONE_BUTTON;//赛区下拉框
    @FindBy(xpath = "/html/body/div[14]/div/ul/li[text()='5 - test server']")
    protected static WebElement TEST_SERVER;//五服测试服
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[2]")
    protected static WebElement ROLE_BUTTONN;//角色下拉框
    @FindBy(xpath = "//li[text()='在线角色']")
    protected static WebElement AROLE;//在线角色选项
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[3]/div/div/div[2]")
    protected static WebElement REASON_BUTTON;//发奖原因下拉框
    @FindBy(xpath = "//li[text()='系统维护/更新补偿']")
    protected static WebElement REASON_WEI;//系统维护选项
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[4]/div/div/div/textarea")
    protected static WebElement INSTRUCTIONS;//详细说明输入框
    @FindBy(id = "button-1065-btnIconEl")
    protected static WebElement ADDITEMS;//添加物品按钮
    @FindBy(xpath = "//input[starts-with(@id, 'textfield-')][1]")
    protected static WebElement PROP;//道具搜索框
    @FindBy(xpath = "//table[starts-with(@id, 'gridview-')][1]")
    protected static WebElement FIRST_PROP;//第一条道具选项
    @FindBy(xpath = "//input[starts-with(@id,'numberfield-')]")
    protected static WebElement PROP_NUM;//物品数量
    @FindBy(xpath = "//span[starts-with(@id,'button-')  and text()='确定']")
    protected static WebElement ACCEPT;//确定按钮
    @FindBy(xpath = "//span[starts-with(@id,'button-')  and text()='执行']")
    protected static WebElement PERFORM;//执行操作按钮
    @FindBy(xpath = "//span[starts-with(@id,'button-')  and text()='Yes']")
    protected static WebElement ACCEPT_PERFORM;//确定执行按钮


}

