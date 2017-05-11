package Data_Management;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/5/11.
 */
public class Get_Excel extends Excel{
    private Workbook work = super.excel();
    public Get_Excel(String file) {
          super(file);
    }

    /**
     * 获得元素
     * @return 元素列表
     */
    private List<String> setele(){
        List<String> ele = new ArrayList();
        //获取一个工作表对象
        Sheet sheet = work.getSheetAt(0);
        //获得表中行的迭代器
        Iterator<Row> rows =  sheet.rowIterator();
        while (rows.hasNext()){
            Row row =  rows.next();
            Cell cell = row.getCell(1);
            //获得每一行的第二列
            String cel = cell.getStringCellValue().toString();
            ele.add(cel);
        }
        try {
            work.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("关闭Excel文件错误");
        }
        return ele;
    }
    public List<String> getele(){
        return this.setele();
    }
    /**
     * 获取物品ID
     * @return
     * @throws IOException
     */
    public List<String> getWP() throws IOException {
        List<String> wp = new ArrayList();
        Sheet sheet = work.getSheetAt(0);
        Iterator<Row> rows = sheet.rowIterator();
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
        Sheet sheet = work.getSheetAt(0);
        Iterator<Row> rows = sheet.rowIterator();
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
        Sheet sheet = work.getSheetAt(0);
        Row row = sheet.getRow(1);
        String name = row.getCell(4).toString();
        String pwd = row.getCell(5).toString();
        yh.add(name);
        yh.add(pwd);
        return yh;
    }

    public static void main(String[] args) {
        Get_Excel get_excel = new Get_Excel("yuansu.xlsx");
        System.out.println(get_excel.getele().get(0));

    }
}
