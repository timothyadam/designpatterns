package com.timothy.proxy.dynamic;

/**
 * Created by wangxin on 2018/6/10.
 */
public class Test {
    public static void main(String[] args) {
        Meipoproxy meipoproxy= new Meipoproxy(new Lisi());
        meipoproxy.findLove();
    }
}
