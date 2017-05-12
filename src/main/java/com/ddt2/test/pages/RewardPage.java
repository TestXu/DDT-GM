package com.ddt2.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * DDT2-GM发奖页面元素
 */
public class RewardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public RewardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[1]/div/div/div[1]/input")
    protected WebElement ZONEBUTTON;//赛区下拉框
    @FindBy(xpath = "/html/body/div[14]/div/ul/li[text()='5 - test server']")
    protected WebElement TEST_SERVER;//五服测试服
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[2]")
    protected WebElement ROLEBUTTONN;//角色下拉框
    @FindBy(xpath = "//li[text()='在线角色']")
    protected WebElement AROLE;//在线角色选项
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[3]/div/div/div[2]")
    protected WebElement REASONBUTTON;//发奖原因下拉框
    @FindBy(xpath = "//li[text()='系统维护/更新补偿']")
    protected WebElement REASON_WEI;//系统维护选项
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[4]/div/div/div/textarea")
    protected WebElement INSTRUCTIONS;//详细说明输入框
    @FindBy(id = "button-1065-btnIconEl")
    protected WebElement ADDITEMS;//添加物品按钮
    @FindBy(xpath = "//input[starts-with(@id, 'textfield-')][1]")
    protected WebElement PROP;//道具搜索框
    @FindBy(xpath = "//table[starts-with(@id, 'gridview-')][1]")
    protected WebElement FIRST_PROP;//第一条道具选项
    @FindBy(xpath = "//input[starts-with(@id,'numberfield-')]")
    protected WebElement PROP_NUM;//物品数量
    @FindBy(xpath = "//span[starts-with(@id,'button-')  and text()='确定']")
    protected WebElement ACCEPT;//确定按钮
    @FindBy(xpath = "//span[starts-with(@id,'button-')  and text()='执行']")
    protected WebElement PERFORM;//执行操作按钮
    @FindBy(xpath = "//span[starts-with(@id,'button-')  and text()='Yes']")
    protected WebElement ACCEPT_PERFORM;//确定执行按钮


}

