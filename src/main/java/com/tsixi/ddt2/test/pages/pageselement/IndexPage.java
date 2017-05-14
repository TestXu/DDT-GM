package com.tsixi.ddt2.test.pages.pageselement;

import com.tsixi.ddt2.test.utils.GetElementXml;

import java.util.Map;


/**
 * DDT2-GM主菜单页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 15:03
 */
public interface IndexPage {
    public Map<String, String[]> indexPageEles = new GetElementXml("elementdata/IndexEleData.xml").getele();
    public String[] INDEX_BUTTON=indexPageEles.get("index_button");//导航下拉框

    public String[] BZDDT=indexPageEles.get("bzddt");//百战斗斗堂选项

    public String[] GAME_BUTTON=indexPageEles.get("game_button");//游戏下拉框

    public String[] REAWARD_BUTTON=indexPageEles.get("reaward_button");//奖励发放按钮


}
