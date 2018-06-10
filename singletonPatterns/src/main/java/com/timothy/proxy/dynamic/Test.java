package com.timothy.proxy.dynamic;

import java.util.Properties;

/**
 * Created by wangxin on 2018/6/10.
 */
public class Test {
    public static void main(String[] args) {


        Person person= (Person) new Meipoproxy().getInstance(new Lisi());
        //lisi.findLove();
      //Meipoproxy.getInstance(new Lisi()).findLove();
        person.findLove();

        //
//        Meipoproxy meipoproxy=
//        meipoproxy.findLove();
    }
}
