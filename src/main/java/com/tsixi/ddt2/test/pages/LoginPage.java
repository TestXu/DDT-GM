package com.tsixi.ddt2.test.pages;

import com.tsixi.ddt2.test.utils.GetElementXml;

import java.util.List;

/**
 * DDT2-GM登录页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 11:20
 */
public interface LoginPage {
    /**
     * 获得当前页面元素值
     */
    public List<String[]> eles = new GetElementXml("elementdata/LoginEleData.xml").getele();
    public String[] NAME_INPUT = eles.get(0);//账号输入框

    public String[] PWD_INPUT = eles.get(1);//密码输入框

    public String[] SERVER = eles.get(2);//选择服务器

    public String[] TEST_SERVER = eles.get(3);//测试服务器

    public String[] LANGUAGE = eles.get(4);//选择语言

    public String[] CHINAESE = eles.get(5);//简体中文

    public String[] LOGIN_BUTTON = eles.get(7);//用户登录按钮
}
