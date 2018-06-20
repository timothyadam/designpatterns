package com.timothy.serializable;

import java.io.Serializable;

/**
 * Created by wangxin on 2018/6/14.
 */
public class Serializables implements Serializable {

   private static final Serializables INSTANCE = new Serializables();

    private Serializables(){}


    public static final Serializables getInstance(){

        return  INSTANCE;
    }

    //readResolve

    public  Object readResolve(){
        return  INSTANCE;
    }



}
