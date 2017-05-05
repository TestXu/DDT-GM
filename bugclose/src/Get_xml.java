import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/18.
 */
public class Get_xml {
    public Document set_xml() throws IOException, SAXException, ParserConfigurationException {
        File file = new File("src/shuju.xml");
        //创建DocumentBuilderFactory对象
        DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
        //创建DocumentBuilder对象
        DocumentBuilder db = dbf.newDocumentBuilder();
        //通过DocumentBuilder对象的parse方法返回一个Document对象
        Document document = db.parse(file);
        //通过Document对象的getElementsByTagName()返根节点的一个list集合
        return document;
    }
    public String get_url() throws ParserConfigurationException, SAXException, IOException {
        Document doc =set_xml();
        String url = doc.getElementsByTagName("url").item(0).getTextContent();
        return url;
    }
    public String[] get_login() throws ParserConfigurationException, SAXException, IOException {
        Document doc = set_xml();
        String[] login = new String[2];
        login[0] = doc.getElementsByTagName("name").item(0).getTextContent();
        login[1] = doc.getElementsByTagName("pwd").item(0).getTextContent();
        return  login;
    }
    }

