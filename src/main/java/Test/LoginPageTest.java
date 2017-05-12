package Test;

import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/12.
 */
public class LoginPageTest {
    @Test
    public void logintest(){
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openurl("http://192.168.2.200:8080/GM/");
        loginPage.login("taoxu","123");
    }
}
