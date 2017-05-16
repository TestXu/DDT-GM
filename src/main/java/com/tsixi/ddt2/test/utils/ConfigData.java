package com.tsixi.ddt2.test.utils;

import com.tsixi.ddt2.test.base.ExcelData;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/16.
 */

/**
 * 系统配置数据
 */
public class ConfigData {
    public static Map<String, String> configDatas = new XMLHelp("base/ConfigData.xml").getConfigData();

    public static String IP = null;//域名

    public final static String BROWSER = configDatas.get("browser");//游览器

    public static void setIP(String IP) {
        ConfigData.IP = IP;
    }

    public static String getIP() {
        return IP;
    }

    /**
     * 判断表格里面选择的网络状态获取不同的ip
     * @return
     */
    public final  boolean getIpType() {
        String ipType = ExcelData.getIpType();
        try {
            if (ipType.equals("内网")) {
                setIP(configDatas.get("in_ip"));
            } else if (ipType.equals("外网")){
                setIP(configDatas.get("out_ip"));
            }else {
                System.out.println("选择网络错误");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}