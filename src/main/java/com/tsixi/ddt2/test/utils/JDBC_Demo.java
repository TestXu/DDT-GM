//package com.ddt2.test.utils; /**
// * Created by Administrator on 2017/4/19.
// */
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class JDBC_Demo {
//
//    private String sql = null;
//    private JDBC db1 = null;
//    private ResultSet ret = null;
//
//    public  List<String> get_ele() {
//        List<String> ele = new ArrayList();
//        sql = "SELECT * FROM usd.bugclose;";//SQL语句
//        db1 = new JDBC(sql);//创建DBHelper对象
//        try {
//            ret = db1.pst.executeQuery();//执行语句，得到结果集
//            while (ret.next()) {
//                String el = ret.getString(1);
//                ele.add(el);
////                String uid = ret.getString(1);
////                String ele = ret.getString(2);
////                String type = ret.getString(3);
////                String ps = ret.getString(4);
////                System.out.println(uid + "\t" + ele + "\t" + type + "\t"+ps);
//            }//显示数据
//            ret.close();
//            db1.close();//关闭连接
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return ele;
//    }
//}