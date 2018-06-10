package com.timothy.lazy;

/**
 * Created by wangxin on 2018/6/7.
 */
public class LazyOne {


    //私有化构造方法
    private LazyOne(){}

    private static LazyOne lazyOne =null;


    public  static LazyOne getNewInstance(){
        if(null== lazyOne){
            lazyOne = new LazyOne();
        }
       return lazyOne;
    }


}
