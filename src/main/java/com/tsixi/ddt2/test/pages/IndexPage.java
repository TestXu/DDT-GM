package com.tsixi.ddt2.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * DDT2-GM主菜单页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 15:03
 */
public class IndexPage {
    /**
     * 获得当前页面元素值
     *
     * @param driver driver对象
     */
    public IndexPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "functionBtn-btnWrap")
    protected static WebElement INDEX_BUTTON;//导航下拉框
    @FindBy(id = "b030000-itemEl")
    protected static WebElement BZDDT;//百战斗斗堂选项
    @FindBy(id = "b030100-btnInnerEl")
    protected static WebElement GAME_BUTTON;//游戏下拉框
    @FindBy(id = "treeview-1015-record-5231")
    protected static WebElement REAWARD_BUTTON;//奖励发放按钮


}
