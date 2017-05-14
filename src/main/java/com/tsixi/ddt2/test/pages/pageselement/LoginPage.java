package com.tsixi.ddt2.test.pages.pageselement;

import com.tsixi.ddt2.test.utils.GetElementXml;

import java.util.Map;

/**
 * DDT2-GM登录页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 11:20
 */
public final class LoginPage {
    /**
     * 获得当前页面元素值
     */
    public final static Map<String, String[]> loginPageEles = new GetElementXml("elementdata/LoginEleData.xml").getele();
    public final static String[] NAME_INPUT = loginPageEles.get("name_input");//账号输入框

    public final static String[] PWD_INPUT = loginPageEles.get("pwd_input");//密码输入框

    public final static String[] SERVER = loginPageEles.get("server");//选择服务器

    public final static String[] TEST_SERVER = loginPageEles.get("test_server");//测试服务器

    public final static String[] LANGUAGE_BUTTON = loginPageEles.get("language_button");//选择语言

    public final static String[] CHINAESE = loginPageEles.get("chinaese");//简体中文

    public final static String[] SAVE_PWD = loginPageEles.get("save_pwd");//保存密码勾选框

    public final static String[] LOGIN_BUTTON = loginPageEles.get("login_button");//用户登录按钮
}
