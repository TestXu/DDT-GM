package com.tsixi.ddt2.test.utils;/**
 * Created by taoxu on 2017/5/14.
 */

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * @author taoxu
 * @create 2017-05-14-22:34
 **/


public class Assertion {

    public static boolean flag = true;

    public static List<Error> errors = new ArrayList<Error>();

    public static void verifyEquals(Object actual, Object expected) {
        try {
            Assert.assertEquals(actual, expected);
        } catch (Error e) {
            errors.add(e);
            flag = false;
        }
    }

    public static void verifyEquals(Object actual, Object expected, String message) {
        try {
            Assert.assertEquals(actual, expected, message);
        } catch (Error e) {
            errors.add(e);
            flag = false;
        }
    }

}