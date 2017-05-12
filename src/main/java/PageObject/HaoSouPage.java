package PageObject;

import ResultPage.ResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HaoSouPage {

    /**
     * @描述：好搜输入框
     */
    @FindBy(name = "q")
    @CacheLookup
    private WebElement HSP_INPUT_KEYWORD;
    /**
     * @描述：好搜搜索按钮
     */
    @FindBy(id = "search-button")
    @CacheLookup
    private WebElement HSP_BUTTON_SEARCH;
    //定义测试地址
    private final String url = "http://www.haosou.com/";
    private static WebDriver driver;

    //提供一个外部获得driver的方法
    public static WebDriver getDriver() {
        return driver;
    }

    //构造方法初始化元素
    public  HaoSouPage() {
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
    }

    //包装退出方法
    public void close() {
        driver.quit();
    }

    //打开网址
    public void openUrl() {
        driver.get(url);
    }

    //输入关键字selenium并点击查询,并且返回到搜索界面
    public ResultPage searchByKeyword(String keyword) {
        HSP_INPUT_KEYWORD.sendKeys(keyword);
        HSP_BUTTON_SEARCH.click();
        return new ResultPage();
    }
}