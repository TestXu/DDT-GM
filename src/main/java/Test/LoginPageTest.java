package Test;

import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/12.
 */
public class LoginPageTest {
    private WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
    @Test
    public void logintest(){
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("----GM工具登录----");
        loginPage.openurl("http://192.168.2.200:8080/GM/");
        loginPage.login("taoxu","123");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Assert.assertTrue(driver.getCurrentUrl().contains("index"));
            System.out.println("登录测试通过");
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }
}
