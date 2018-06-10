package com.timothy.lazy;

/**
 * Created by wangxin on 2018/6/7.
 */
public class LazyTwo {

    private LazyTwo(){}

    private static LazyTwo lazyTwo=null;

    public synchronized   static  LazyTwo getNewInstance(){

        if(null==lazyTwo){
            lazyTwo= new LazyTwo();
        }
        return lazyTwo;
    }


}
