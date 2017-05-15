package com.tsixi.ddt2.test.testcases;

import com.tsixi.ddt2.test.utils.Excel;
import com.tsixi.ddt2.test.utils.Get_Excel;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Demo {
    public static void main(String[] args) {
        Get_Excel excel = new Get_Excel("userdata/suju.xlsx");
        System.out.println(excel.getele().get(0));
    }
}
