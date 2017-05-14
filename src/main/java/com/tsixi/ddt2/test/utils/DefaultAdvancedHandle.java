package com.tsixi.ddt2.test.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author taoxu
 * 处理页面的高级操作
 * 总有适合自己的默认方法,下面等待时间我设置默认方法.为了满足开闭原则,我那天也懒得改,还有很多比默认方法强大同类型方法
 */
public class DefaultAdvancedHandle implements AdvanceHandle {



    private WebDriver driver ;
    private static String  preWindowString;
    private static String imagePath=(new File("").getAbsolutePath()).toString();

    public DefaultAdvancedHandle(WebDriver driver) {
        this.driver = driver;
    }

    /*
     * 这个方法是用于切换为原来的窗口,但是前提是一定有弹框出现,并且使用过切换窗口方法
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#changeLastWindow()
     */
    @Override
    public void changeLastWindow() {
        driver.switchTo().window(preWindowString);
    }

    /*
     * 当弹框出现的时候,调用就会切换到对应的窗口
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#changeWindow()
     */
    @Override
    public void changeWindow() {// 这个方法是处理跳出页面
        preWindowString = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String cruWindowString;
        while (it.hasNext()) {
            cruWindowString = it.next();
            if (preWindowString == cruWindowString) {
                continue;
            }
            driver.switchTo().window(cruWindowString);
        }
    }

    /*
     * 刷新页面之后继续,等待元素
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElementByRefresh(org.openqa.selenium.By, int, int)
     */
    @Override
    public  boolean waitElementByRefresh(By locator,int time,int k){
        int i = 0;
        while(waitElementByWait(locator,time)){
            driver.navigate().refresh();
            i++;
            if(i == k){
                return false;
            }
        }
        return true;
    }



    /*
     * 刷新页面等待元素
     * 不用指定时间,系统指定固定时间
     * 方法重载
     * 默认刷新页面2次,等待5秒
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElementByRefresh(org.openqa.selenium.By)
     */
    @Override
    public  boolean waitElementByRefresh(By locator){
        return waitElementByRefresh(locator,5,2);
    }



    /*
     * 最好不用这个方法,但是我还是提供给你
     * 这个方法是处理等待元素方法1
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElementByWait(org.openqa.selenium.By, int, boolean)
     */
    @Override
    public  boolean waitElementByWait(By locator,int time,boolean b){

        long start = System.currentTimeMillis();

        while(!isElementExsit(locator)){
            if(b){
                if(System.currentTimeMillis() >= (start +time*1000)){
                    break;
                }
            }
        }
        return isElementExsit(locator);
    }

    /*
     * 等待无限时间
     * 不建议使用,如果一直没有加载出来,线程就阻塞
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElementByWait(org.openqa.selenium.By)
     */
    @Override
    public  boolean waitElementByWait(By locator){
        return waitElementByWait(locator,0,false);
    }

    /*
     * 等待指定时间
     * 建议使用,我自己写的方法
     * 方法与显性等待是一样的
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElementByWait(org.openqa.selenium.By, int)
     */
    @Override
    public  boolean waitElementByWait(By locator,int time){
        return waitElementByWait(locator,time,true);
    }

    /*
     * 判断元素是否存在
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#isElementExsit(org.openqa.selenium.By)
     */
    @Override
    public  boolean isElementExsit(By locator) {
        boolean flag = false;
        try {
            WebElement element=driver.findElement(locator);
            flag= null != element;
        } catch (NoSuchElementException e) {
            return flag;
        }
        return flag;
    }

    /*
     * 这个方法是处理元素加载方法2
     * 显性等待指定时间
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElement(org.openqa.selenium.By, int)
     */
    @Override
    public  WebElement waitElement(final By by, int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(new ExpectedCondition<WebElement>(){
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(by);
            }});
        return null;
    }

    /*
     * 默认等10秒
     * 10秒我比较喜欢所以搞一个单独方法,少写一个条件而已
     * 显性等待10秒之内加载,比较好用,建议使用
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElement(org.openqa.selenium.By)
     */
    @Override
    public  WebElement waitElement(By by){
        return waitElement(by,10);
    }

    /*
     * 这个方法是处理元素加载的方法3
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElementByThread(int)
     */
    @Override
    public  void waitElementByThread(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Thread睡眠被唤醒,这本来是个异常,我已经手动处理:原因是因为我估计这个线程被其他线程唤醒,开始执行,所以并没有抛出异常,直接处理");
        }
    }

    /*
     * 这个方法是处理元素加载的方法4
     * 建议不要使用这个,这个是隐形等待,当改变这个时候可能会影响其他元素等待
     * 说白了是全局,注意不要使用
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#waitElementByInvisible(int)
     */
    @Override
    public  void waitElementByInvisible(int second) {
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }

    /*
     * 下拉框操作选择字符串为str
     * 按照值定位
     * 这个需要找到下拉框的value值定位
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#selectValue(java.lang.String, java.lang.String)
     */
    @Override
    public void selectValue(String estr,String str){
        Select select = new Select(driver.findElement(By.id(estr)));
        select.selectByValue(str);
    }

    /*
     * 下拉框操作选择字符串为str
     * 可见文本定位
     * 建议用这个
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#select(java.lang.String, java.lang.String)
     */
    @Override
    public void select(String estr,String str){
        Select select = new Select(driver.findElement(By.id(estr)));
        select.selectByVisibleText(str);
    }

    /*
     * 索引定位
     * 下拉框操作选择字符串Index为index
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#select(java.lang.String, int)
     */
    @Override
    public void select(String estr,int index){
        Select select = new Select(driver.findElement(By.id(estr)));
        select.selectByIndex(index);
    }


    /*
     * 最大化窗口
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#maximize()
     */
    @Override
    public void maximize() {
        driver.manage().window().maximize();
    }

    /*
     * 弹框点击确定
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#alertAccept()
     */
    @Override
    public void alertAccept(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    /*
     * 弹框点击确定
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#alertDismiss()
     */
    @Override
    public void alertDismiss(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    /*
     * 得到弹框文本
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#alertGetText()
     */
    @Override
    public void alertGetText(){
        Alert alert = driver.switchTo().alert();
        alert.getText();
    }

    /*
     * 上传文件,上传图片等
     * 方法可能无效,Driver自带的
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#UploadBySendKeys(java.lang.String, java.lang.String)
     */
    @Override
    public void UploadBySendKeys(String estr,String strPath){
        WebElement adFileUpload =driver.findElement(By.id(estr));
        strPath=imagePath+"\\"+strPath;
        adFileUpload.sendKeys(strPath);
    }

    /*
     * 上传文件,上传图片
     * 建议使用这个,100%没得问题
     * 我利用复制粘贴,然后你懂得
     * 这里面的strPath,我使用的相对路径,相对项目的根路径写的(好处就是可以到处移动,他的参考点事这个项目的根路径)
     */
    /* (non-Javadoc)
     * @see pers.xeon.automate.auxt.AdvanceHandle#upload(java.lang.String, java.lang.String)
     */
    @Override
    public void upload(String estr,String strPath){
        driver.findElement(By.id(estr)).click();
        try {
            upload(strPath);
        } catch (AWTException e) {
            System.out.println("AWTException:由于Robot类初始化失败");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException:可能导致上传失败,线程被唤醒");
        }

    }


    /*
     * 得到系统剪贴板
     */
    private  void copy(String text) {
        //拿到当前系统剪切板,首先拿到工具箱,然后得到系统剪切板
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //选中文本
        StringSelection selection = new StringSelection(text);
        //搞到剪切板里面去
        clipboard.setContents(selection, null);
    }

    /*
     * 这个方法是复制指定字符串的文本到剪切板 调用keyPressWithCtrl实现ctrl + v,然后enter操作
     */
    private  void keyPressString(Robot r, String str) throws InterruptedException {
        copy(str);
        keyPressWithCtrl(r);// 粘贴
    }

    /*
     * 实现ctrl + v,然后enter操作
     */
    private void keyPressWithCtrl(Robot r) throws InterruptedException {
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }

    /*
     * 对付上传按钮方法
     */
    private  void upload(String image) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        keyPressString(robot, image);
    }

    @Override
    public void frame(String FrameName) {
        driver.switchTo().frame(FrameName);
    }
}