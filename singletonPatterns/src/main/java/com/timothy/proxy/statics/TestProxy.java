package com.timothy.proxy.statics;

/**
 * Created by wangxin on 2018/6/10.
 */
public class TestProxy {


    public static void main(String[] args) {
        Father father= new Father(new Son());

        father.findLove();


    }
}
