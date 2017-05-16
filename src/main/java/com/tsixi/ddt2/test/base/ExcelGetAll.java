package com.tsixi.ddt2.test.base;

import com.tsixi.ddt2.test.utils.Excel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/5/16.
 */

/**
 * 获取excel表格里所有的数据
 */
public class ExcelGetAll extends Excel {
    public ExcelGetAll(String file) {
        super(file);
    }
    private List<String> propIds = new ArrayList();//物品ID
    private List<String> propNums = new ArrayList();//物品数量
    private String[] yhData = new String[2];//用户信息
    private String ipType;//IP类型
    private String outServerType;//外部选择服务器
    private String inServerType;//内部选择服务器
    private String roleId;//角色ID
    private String instructions;//详细说明信息
    /**
     * 获取表格所有数据
     * @return
     */
    public boolean getAll() {
        try {
            Sheet sheet = super.workbook.getSheetAt(0);
            Row row1 = sheet.getRow(1);
            //获取用户账号信息
            yhData[0] = row1.getCell(4).getStringCellValue();
            //获取用户密码信息
            yhData[1] = row1.getCell(5).getStringCellValue();
            //获取IP类型
            ipType = row1.getCell(7).getStringCellValue();
            //获取外部服务器信息
            outServerType = row1.getCell(8).getStringCellValue();
            //获取发放奖励服务器信息
            inServerType = row1.getCell(9).getStringCellValue();
            Row row2 = sheet.getRow(4);
            //获取发放奖励角色信息
            roleId = row2.getCell(4).getStringCellValue();
            //获取发放奖励说明信息
            instructions = row2.getCell(5).getStringCellValue();
            Iterator<Row> rows = sheet.rowIterator();
            while (rows.hasNext()) {
                Row row = rows.next();
                String propId = row.getCell(0).toString();
                String propNum = row.getCell(2).toString();
                propIds.add(propId);
                propNums.add(propNum);
            }
            ExcelData.setPropIds(propIds);
            ExcelData.setPropNums(propNums);
            ExcelData.setYhData(yhData);
            ExcelData.setIpType(ipType);
            ExcelData.setOutServerType(outServerType);
            ExcelData.setInServerType(inServerType);
            ExcelData.setRoleId(roleId);
            ExcelData.setInstructions(instructions);
            close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
