package Test;

import PageObject.HaoSouPage;
import org.testng.annotations.Test;

public class HaoSouPageTest {
    @Test
    public void searchTest() {
        //实例化haosou页面对象模型
        HaoSouPage hsp = new HaoSouPage();
        //使用页面封装的打开链接方法
        hsp.openUrl();
        //使用页面封装的输入操作,验证搜索结果输入框页面的值是不是selenium
        hsp.searchByKeyword("selenium").checkKeyword();
        //使用页面封装的退出操作
        hsp.close();
    }
}