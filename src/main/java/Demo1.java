import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        WebDriver dr = new ChromeDriver();
        dr.get("http://www.baidu.com");
        WebDriverWait wait = new WebDriverWait(dr, 20);
        WebElement A = wait.until(ExpectedConditions.elementToBeClickable(By.id("kw")));
        A.sendKeys("你好");
        WebElement B = wait.until(ExpectedConditions.elementToBeClickable(By.id("su")));
        B.click();
        dr.quit();
    }
}
