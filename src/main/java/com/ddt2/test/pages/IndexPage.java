package com.ddt2.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * DDT2-GM主菜单页面元素
 */
public class IndexPage {
    public IndexPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "functionBtn-btnWrap")
    protected static WebElement INDEXBUTTON;//导航下拉框
    @FindBy(id = "b030000-itemEl")
    protected static WebElement BZDDT;//百战斗斗堂选项
    @FindBy(id = "b030100-btnInnerEl")
    protected static WebElement GAMEBUTTON;//游戏下拉框
    @FindBy(id = "treeview-1015-record-5231")
    protected static WebElement REAWARDBUTTON;//奖励发放按钮


}
