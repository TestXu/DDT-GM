import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/4/13.
 */
public class Suju {
    /**
     * 获得数据文件
     * @return
     * @throws IOException
     */
    private  Sheet setsuju() throws IOException {
        String file = "suju.xlsx";
        ClassLoader classLoader = Excel.class.getClassLoader();
        URL resource = classLoader.getResource(file);
        String path = resource.getPath();
        InputStream input = new FileInputStream(path);
        Workbook wr = new XSSFWorkbook(input);
        Sheet sheet = wr.getSheetAt(0);
        wr.close();
        return sheet;
    }
    private Iterator<Row> setrow() throws IOException {
        Sheet sheet = setsuju();
        Iterator<Row> rows = sheet.rowIterator();
        return  rows;
    }

    /**
     * 获取物品ID
     * @return
     * @throws IOException
     */
    public List<String> getWP() throws IOException {
        List<String> wp = new ArrayList();
        Iterator<Row> rows = setrow();
        while (rows.hasNext()){
            Row row =  rows.next();
            String cell = row.getCell(0).toString();
            wp.add(cell);
        }
        return wp;
    }

    /**
     * 获取数量
     * @return
     * @throws IOException
     */
    public List<String> getSL() throws IOException {
        List<String> sl = new ArrayList();
        Iterator<Row> rows = setrow();
        while (rows.hasNext()){
            Row row =  rows.next();
            String cell = row.getCell(2).toString();
            sl.add(cell);
        }
        return sl;
    }

    /**
     * 获取登录用户数据
     * @return
     */
    public List<String> getYH() throws IOException {
        List<String> yh = new ArrayList();
        Sheet sheet = setsuju();
        Row row = sheet.getRow(1);
        String name = row.getCell(4).toString();
        String pwd = row.getCell(5).toString();
        yh.add(name);
        yh.add(pwd);
        return yh;
    }

}
