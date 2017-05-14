package com.tsixi.ddt2.test.pages;

import com.tsixi.ddt2.test.utils.GetElementXml;

import java.util.List;


/**
 * DDT2-GM主菜单页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 15:03
 */
public interface IndexPage {
    public List<String[]> eles = new GetElementXml("elementdata/IndexEleData.xml").getele();
    public String[] INDEX_BUTTON=eles.get(0);//导航下拉框

    public String[] BZDDT=eles.get(1);//百战斗斗堂选项

    public String[] GAME_BUTTON=eles.get(2);//游戏下拉框

    public String[] REAWARD_BUTTON=eles.get(3);//奖励发放按钮


}
