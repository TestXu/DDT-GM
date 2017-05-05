import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Excel {
    /**
     * Excel获取元素信息
     * @return
     * @throws IOException
     */
    public List<String> setele(String file) throws IOException {
        List<String> el = new ArrayList();
        ClassLoader classLoader = Excel.class.getClassLoader();
        URL resource = classLoader.getResource(file);
        String path = resource.getPath();
        InputStream input =  new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(input);
        //获得一个工作簿对象
        Sheet sheet = workbook.getSheetAt(0);
        //获取一个工作表对象
        Iterator<Row> rows =  sheet.rowIterator();
        //获得表中行的迭代器
        while (rows.hasNext()){
            Row row =  rows.next();
            Cell cell = row.getCell(1);
            //获得每一行的第二列
            String cel = cell.getStringCellValue().toString();
            el.add(cel);
        }
        workbook.close();
        return el;
    }


}
