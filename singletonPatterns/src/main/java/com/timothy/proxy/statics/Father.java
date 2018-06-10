package com.timothy.proxy.statics;

/**
 * Created by wangxin on 2018/6/10.
 */
public class Father {

    private Son son;

    public Father (Son son){

        this.son=son;
    }


    public  void findLove(){
        this.son.findLove();

    }



}
