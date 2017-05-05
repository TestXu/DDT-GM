import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/4/12.
 */
public class Excel {
    /**
     * Excel获取元素信息
     * @return
     * @throws IOException
     */
    public List<String>  setele(File file) throws IOException {
        List<String> el = new ArrayList();
        InputStream input =new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(input);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rows =  sheet.rowIterator();
        while (rows.hasNext()){
            Row row =  rows.next();
            Cell cell = row.getCell(1);
            String cel = cell.getStringCellValue().toString();
            el.add(cel);
        }
        workbook.close();
        return el;
    }


}
