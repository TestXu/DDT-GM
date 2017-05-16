package com.tsixi.ddt2.test.pages.pageselement;

import com.tsixi.ddt2.test.base.ExcelData;
import com.tsixi.ddt2.test.base.ExcelGetAll;
import com.tsixi.ddt2.test.utils.XMLHelp;

import java.util.Map;

/**
 * DDT2-GM登录页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 11:20
 */
public final class LoginPage {
    public final static Map<String, String[]> loginPageEles = new XMLHelp("elementdata/LoginEleData.xml").getele();
    public final static String[] NAME_INPUT = loginPageEles.get("name_input");//账号输入框

    public final static String[] PWD_INPUT = loginPageEles.get("pwd_input");//密码输入框

    public final static String[] SERVER = loginPageEles.get("server");//选择服务器

    public  static String[] TEST_SERVER = new String[2];//测试服务器

    public final static String[] LANGUAGE_BUTTON = loginPageEles.get("language_button");//选择语言

    public final static String[] CHINAESE = loginPageEles.get("chinaese");//简体中文

    public final static String[] SAVE_PWD = loginPageEles.get("save_pwd");//保存密码勾选框

    public final static String[] LOGIN_BUTTON = loginPageEles.get("login_button");//用户登录按钮

    public static String[] getTestServer() {
        return TEST_SERVER;
    }

    public static void setTestServer(String[] testServer) {
        TEST_SERVER = testServer;
    }
    public  void  ServerType(){
        String[] test_servers = new String[2];
        String test_server = loginPageEles.get("test_server")[1]+ ExcelData.getOutServerType()+"']";
        test_servers[0]=loginPageEles.get("test_server")[0];
        test_servers[1] = test_server;
        setTestServer(test_servers);
    }
}
