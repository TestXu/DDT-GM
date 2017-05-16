package com.tsixi.ddt2.test.pages.pageselement;

import com.tsixi.ddt2.test.utils.XMLHelp;

import java.util.Map;


/**
 * DDT2-GM主菜单页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 15:03
 */
public final class IndexPage {
    public final static Map<String, String[]> indexPageEles = new XMLHelp("elementdata/IndexEleData.xml").getele();

    public final static String[] INDEX_BUTTON = indexPageEles.get("index_button");//导航下拉框

    public final static String[] BZDDT = indexPageEles.get("bzddt");//百战斗斗堂选项

    public final static String[] GAME_BUTTON = indexPageEles.get("game_button");//游戏下拉框

    public final static String[] REAWARD_BUTTON = indexPageEles.get("reaward_button");//奖励发放按钮


}
