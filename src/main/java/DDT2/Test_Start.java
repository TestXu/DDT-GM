package DDT2;

import Data_Management.Get_Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/12.
 */
public class Test_Start {
    private WebDriver dr;
    private Get_Excel excel = new Get_Excel("yuansu.xlsx");//获得元素文件
    private List<String> ele = excel.getele();//获得元素
    private Get_Excel sj = new Get_Excel("suju.xlsx");//获得数据文件
    private List<String> wp = sj.getWP();//获取物品ID
    private List<String> sl = sj.getSL();//获取物品数量
    private String url = "http://192.168.2.200:8080/GM/";
    private List<String> yh = sj.getYH();//获取用户数据
    private List<String> errors = new ArrayList<String>();
    public Test_Start() throws IOException {
    }

    @BeforeClass
    public void setup(){
        dr = new ChromeDriver();
        dr.manage().window().maximize();
    }
    @AfterClass
    public void teardown(){

        dr.quit();
    }
    @Test
    public void test_login() throws IOException, InterruptedException {
        dr.get(url);
        login();
        setfajiang();
        getfajiang();
    }

    /**
     * 执行登录操作
     * @throws IOException
     */
    public  void login() throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(dr, 20);
        WebElement name1 = wait.until(ExpectedConditions.elementToBeClickable(By.id(ele.get(1))));
        name1.sendKeys(yh.get(0));//账号输入框
        WebElement name2 = wait.until(ExpectedConditions.elementToBeClickable(By.id(ele.get(2))));
        name2.sendKeys(yh.get(1));//密码输入框
        Thread.sleep(1000);
        WebElement f1 = wait.until(ExpectedConditions.elementToBeClickable(By.id(ele.get(3))));
        f1.click();
        WebElement f2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ele.get(4))));
        f2.click();
        WebElement f3 = wait.until(ExpectedConditions.elementToBeClickable(By.id(ele.get(5))));
        f3.click();
        WebElement f4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ele.get(6))));
        f4.click();
        WebElement f5 = wait.until(ExpectedConditions.elementToBeClickable(By.id(ele.get(7))));
        f5.click();
        WebElement f6 = wait.until(ExpectedConditions.elementToBeClickable(By.id(ele.get(8))));
        f6.click();
    }

    /**
     * 执行选择发奖方式
     */
    public void setfajiang(){
        try {
            Assert.assertTrue(dr.getCurrentUrl().contains("GM/index"));
        }catch (Error e){
            String error = "登录成功后跳转网页地址错误："+e.toString();
            System.out.println(error);
            errors.add(error);
        }
        WebDriverWait wait = new WebDriverWait(dr, 20);
        WebElement a1 = wait.until(ExpectedConditions.elementToBeClickable(By.id(ele.get(12))));
        a1.click();
        WebElement a2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(13))));
        a2.click();
        WebElement a3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(14))));
        a3.click();
        WebElement a4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(15))));
        a4.click();
        WebElement a5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(16))));
        a5.click();
        WebElement a6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(17))));
        a6.click();
        WebElement a7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(18))));
        a7.click();
        WebElement a8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(19))));
        a8.sendKeys("hello");
    }

    /**
     * 选择发放的奖励物品并执行
     * @throws InterruptedException
     */
    public void getfajiang() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(dr, 20);
        for (int i=1;i<wp.size();i++){
            dr.findElement(By.id(ele.get(20))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(21)))).sendKeys("");
            dr.findElement(By.xpath(ele.get(21))).clear();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(21)))).sendKeys(wp.get(i));
            Thread.sleep(500);
            dr.findElement(By.xpath(ele.get(22))).click();
            Thread.sleep(500);
            dr.findElement(By.xpath(ele.get(23))).sendKeys("");
            dr.findElement(By.xpath(ele.get(23))).clear();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(23)))).sendKeys(sl.get(i));
            Thread.sleep(500);
            dr.findElement(By.xpath(ele.get(24))).click();
        }
        Thread.sleep(1000);
        WebElement a6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(25))));
        a6.click();
        WebElement a7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ele.get(26))));
        a7.click();

    }
}
