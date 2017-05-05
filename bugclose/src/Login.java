import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/4/18.
 */
public class Login {
    private File file = new File("src/bugclose1.xlsx");
    private Excel excel = new Excel();
    private List<String> ele = excel.setele(file);
    private Get_xml xml = new Get_xml();
    private WebDriver dr;

    public Login() throws IOException {
        List<String> ele = excel.setele(file);
    }

    @BeforeClass
    public void  setup() {
        dr = new FirefoxDriver();
        dr.manage().window().maximize();
    }
    @AfterClass
    public void  teardown(){

        dr.quit();
    }
    @org.testng.annotations.Test
    public void login() throws ParserConfigurationException, SAXException, IOException {
        geturl();
    }
    public void geturl() throws IOException, SAXException, ParserConfigurationException {
        String url = xml.get_url();
        dr.get(url);
    }
    public void findele() throws IOException {
     //   List<String> ele = excel.setele(file);
    }
}
