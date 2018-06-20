package com.timothy.proxy.cglib;

/**
 * Created by wangxin on 2018/6/17.
 */
public class CglibTest {


    public static void main(String[] args)  {


        wangwu obj = null;
        try {
            obj = (wangwu)new CglibMeiPo().getInstance(wangwu.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        obj.findlove();


    }



}
