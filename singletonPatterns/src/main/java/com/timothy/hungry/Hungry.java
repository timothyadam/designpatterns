package com.timothy.hungry;

/**
 *
 * 单例中的饿汉式
 *
 * Created by wangxin on 2018/6/7.
 **/

public class Hungry {

    //私有化构造方法
    private  Hungry(){}

    //创造一个私有的且不可变的实例化对象
    private static final Hungry hungry = new Hungry();

    public static Hungry  getNewInstance(){
     return  hungry;
    }


}
