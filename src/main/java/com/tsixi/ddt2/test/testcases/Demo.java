package com.tsixi.ddt2.test.testcases;/**
 * Created by taoxu on 2017/5/14.
 */

import com.tsixi.ddt2.test.pages.LoginPage;

/**
 * @author taoxu
 * @create 2017-05-14-0:29
 **/
public class Demo implements LoginPage{
    public  void go(){
        System.out.println(NAME_INPUT[0]+"----"+NAME_INPUT[1]);
    }


}
