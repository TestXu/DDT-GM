package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage {
    /**搜索结果界面的搜索框*/
    @FindBy(id="keyword")
    @CacheLookup
    private WebElement RP_INPT_KEYWORD;

    //构造方法初始化元素
    public ResultPage(){
        PageFactory.initElements(HaoSouPage.getDriver(), this);
    }

    /**验证输入框的字是不是Selenium*/
    public void checkKeyword(){
        //Assert是TestNG提供的一个断言操作，assertEquals(实际值，期望值),判断两个值是不是相等的。
        Assert.assertEquals(RP_INPT_KEYWORD.getAttribute("value"), "selenium");
    }
}