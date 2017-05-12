package DDT2;

import Data_Management.Excel;
import Data_Management.Get_Dom4j;
import Data_Management.Get_Excel;
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
//        Get_Dom4j get_dom4j = new Get_Dom4j("shuju.xml");
//        get_dom4j.getele();
//        get_dom4j.close();
        Excel get_excel = new Excel("yuansu.xlsx");
//        System.out.println(get_excel.getele().get(0));
     //   get_excel.close();
//        Get_Excel get_excel2 = new Get_Excel("suju.xlsx");
//        System.out.println(get_excel2.getSL().get(0));
//        get_excel.close();


    }
}
