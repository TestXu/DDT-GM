package com.tsixi.ddt2.test.base;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16.
 */

/**
 * 用户配置数据
 */
public class ExcelData {
    public static List<String> propIds;//发放奖励物品ID
    public static List<String> propNums;//发放奖励物品数量
    public static String[] yhData;//用户登录数据
    public static String ipType;//网络类型
    public static String outServerType;//外部服务器类型
    public static String inServerType;//内部服务器类型
    public static String roleId;//角色ID
    public static String instructions;//详情说明信息

    public static String getOutServerType() {
        return outServerType;
    }

    public static void setOutServerType(String outServerType) {
        ExcelData.outServerType = outServerType;
    }

    public static String getInServerType() {
        return inServerType;
    }

    public static void setInServerType(String inServerType) {
        ExcelData.inServerType = inServerType;
    }


    public static void setPropIds(List<String> propIds) {
        ExcelData.propIds = propIds;
    }

    public static void setPropNums(List<String> propNums) {
        ExcelData.propNums = propNums;
    }

    public static void setYhData(String[] yhData) {
        ExcelData.yhData = yhData;
    }

    public static void setIpType(String ipType) {
        ExcelData.ipType = ipType;
    }

    public final static List<String> getPropNums() {
        return propNums;
    }

    public final static String[] getYhData() {
        return yhData;
    }

    public final static String getIpType() {
        return ipType;
    }

    public final static List<String> getPropIds() {
        return propIds;
    }

    public static String getRoleId() {
        return roleId;
    }

    public static void setRoleId(String roleId) {
        ExcelData.roleId = roleId;
    }

    public static String getInstructions() {
        return instructions;
    }

    public static void setInstructions(String instructions) {
        ExcelData.instructions = instructions;
    }
}
