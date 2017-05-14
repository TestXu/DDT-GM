package com.tsixi.ddt2.test.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by taoxu on 2017/5/14.
 */
public interface IDemo {
//    public List<String> eles = new GetElementXml("LoginEleData.xml").getele();
    public  String INDEX_BUTTON ="kw";//导航下拉框
    public String BUTTON ="su";
    public void login(WebDriver driver);
}
