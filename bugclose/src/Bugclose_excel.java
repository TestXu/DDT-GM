import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/18.
 */
public class Bugclose_excel {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
       // File file = new File("bugclose/src/bugclose1.xlsx");
        Get_xml xml = new Get_xml();
        String url = xml.get_url();
        System.out.println(url);
    }

}

