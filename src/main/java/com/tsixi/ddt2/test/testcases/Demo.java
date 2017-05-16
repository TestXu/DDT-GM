package com.tsixi.ddt2.test.testcases;

import com.tsixi.ddt2.test.base.ExcelData;
import com.tsixi.ddt2.test.base.ExcelGetAll;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Demo {
        public static void main(String[] args) {
            new ExcelGetAll("userdata/suju.xlsx").getAll();
            String a = ExcelData.getRoleId();
            System.out.println(a);
        }

}
