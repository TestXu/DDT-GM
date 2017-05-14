package com.tsixi.ddt2.test.pages;

import com.tsixi.ddt2.test.utils.GetElementXml;

import java.util.List;

/**
 * DDT2-GM发奖页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 16:23
 */
public interface RewardPage {
    public List<String[]> eles = new GetElementXml("elementdata/RewardEleData.xml").getele();
    public String[] ZONE_BUTTON = eles.get(0);//赛区下拉框

    public String[] TEST_SERVER = eles.get(1);//五服测试服

    public String[] ROLE_BUTTONN = eles.get(2);//角色下拉框

    public String[] AROLE = eles.get(3);//在线角色选项

    public String[] REASON_BUTTON = eles.get(4);//发奖原因下拉框

    public String[] REASON_WEI = eles.get(5);//系统维护选项

    public String[] INSTRUCTIONS = eles.get(6);//详细说明输入框

    public String[] ADDITEMS = eles.get(7);//添加物品按钮

    public String[] PROP = eles.get(8);//道具搜索框

    public String[] FIRST_PROP = eles.get(9);//第一条道具选项

    public String[] PROP_NUM = eles.get(10);//物品数量

    public String[] ACCEPT = eles.get(11);//确定按钮

    public String[] PERFORM = eles.get(12);//执行操作按钮

    public String[] ACCEPT_PERFORM = eles.get(13);//确定执行按钮


}

