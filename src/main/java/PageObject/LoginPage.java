package PageObject;

import Data_Management.Get_Dom4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Administrator on 2017/5/12.
 */

/**
 * DDT2-GM登录页面
 */
public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait =new WebDriverWait(driver,20);
//    private List<String> ele = new Get_Dom4j("LoginEleData").getele();
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "textfield-1009-inputEl")
    @CacheLookup
    private static WebElement nameInput;//账号输入框

    @FindBy(id = "textfield-1010-inputEl")
    @CacheLookup
    private static WebElement pwdInput;//密码输入框

    @FindBy(id = "combo-1011-trigger-picker")
    @CacheLookup
    private static WebElement server;//选择服务器

    @FindBy(css = "ul#boundlist-1018-listEl > li[data-recordindex='0']")
    @CacheLookup
    private static WebElement test_server;//测试服务器

    @FindBy(id = "combo-1012-trigger-picker")
    @CacheLookup
    private static WebElement language;//选择语言

    @FindBy(css = "ul#boundlist-1020-listEl>li[data-recordindex='0']")
    @CacheLookup
    private static WebElement Chinaese;//简体中文

    @FindBy(id = "loginBtn-btnEl")
    @CacheLookup
    private static WebElement loginButton;//用户登录按钮
    public void openurl(String url){
        driver.get(url);
    }
    public void login(String name,String pwd){
        wait.until(ExpectedConditions.elementToBeClickable(nameInput)).sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(pwdInput)).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(server)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(test_server)).click();
        wait.until(ExpectedConditions.elementToBeClickable(language)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(Chinaese)).click();
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
