package com.tsixi.ddt2.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @Author taoxu
 * 高级操作接口
 */
public interface AdvanceHandle {

    // 窗口最大化
    public void maximize();

    /*
     * 这个方法是用于切换为原来的窗口,但是前提是一定有弹框出现,并且使用过切换窗口方法
     */
    public void changeLastWindow();

    /*
     * 当弹框出现的时候,调用就会切换到对应的窗口
     */
    public void changeWindow();

    /*
     * 刷新页面之后继续,等待元素
     */
    public boolean waitElementByRefresh(By locator, int time, int k);

    /*
     * 刷新页面等待元素 不用指定时间,系统指定固定时间 方法重载 默认刷新页面2次,等待5秒
     */
    public boolean waitElementByRefresh(By locator);

    /*
     * 最好不用这个方法,但是我还是提供给你 这个方法是处理等待元素方法1
     */
    public boolean waitElementByWait(By locator, int time, boolean b);

    /*
     * 等待无限时间 不建议使用,如果一直没有加载出来,线程就阻塞
     */
    public boolean waitElementByWait(By locator);

    /*
     * 等待指定时间 建议使用,我自己写的方法 方法与显性等待是一样的
     */
    public boolean waitElementByWait(By locator, int time);

    /*
     * 判断元素是否存在
     */
    public boolean isElementExsit(By locator);

    /*
     * 这个方法是处理元素加载方法2 显性等待指定时间
     */
    public WebElement waitElement(By by, int time);

    /*
     * 默认等10秒 10秒我比较喜欢所以搞一个单独方法,少写一个条件而已 显性等待10秒之内加载,比较好用,建议使用
     */
    public WebElement waitElement(By by);

    /*
     * 这个方法是处理元素加载的方法3
     */
    public void waitElementByThread(int ms);

    /*
     * 这个方法是处理元素加载的方法4 建议不要使用这个,这个是隐形等待,当改变这个时候可能会影响其他元素等待 说白了是全局,注意不要使用
     */
    public void waitElementByInvisible(int second);

    /*
     * 下拉框操作选择字符串为str 按照值定位 这个需要找到下拉框的value值定位
     */
    public void selectValue(String estr, String str);

    /*
     * 下拉框操作选择字符串为str 可见文本定位 建议用这个
     */
    public void select(String estr, String str);

    /*
     * 索引定位 下拉框操作选择字符串Index为index
     */
    public void select(String estr, int index);

    /*
     * 弹框点击确定
     */
    public void alertAccept();

    /*
     * 弹框点击确定
     */
    public void alertDismiss();

    /*
     * 得到弹框文本
     */
    public void alertGetText();

    /*
     * Frame切换
     */
    public void frame(String FrameName);

    /*
     * 上传文件,上传图片等 方法可能无效,Driver自带的
     */
    public void UploadBySendKeys(String estr, String strPath);

    /*
     * 上传文件,上传图片 建议使用这个,100%没得问题 我利用复制粘贴,然后你懂得
     * 这里面的strPath,我使用的相对路径,相对项目的根路径写的(好处就是可以到处移动,他的参考点事这个项目的根路径)
     */
    public void upload(String estr, String strPath);


}
