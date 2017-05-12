package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017/5/12.
 */

/**
 * DDT2-GM主菜单页面
 */
public class IndexPage {
    private WebDriver driver;
    WebDriverWait wait =new WebDriverWait(driver,20);
    public IndexPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "functionBtn-btnWrap")
    private static WebElement indexButton;//导航下拉框
    @FindBy(id = "b030000-itemEl")
    private static WebElement bzddt;//百战斗斗堂选项
    @FindBy(id = "b030100-btnInnerEl")
    private static WebElement gameButton;//游戏下拉框
    @FindBy(id = "treeview-1015-record-5231")
    private static WebElement reawardButton;//奖励发放按钮

    /**
     * 执行发奖
     */
    public void getreaward(){
        wait.until(ExpectedConditions.elementToBeClickable(reawardButton)).click();
    }
}
