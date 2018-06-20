package com.timothy.proxy.custom;

import com.timothy.proxy.dynamic.Lisi;
import com.timothy.proxy.dynamic.Person;

/**
 * Created by wangxin on 2018/6/19.
 */
public class CustomPorxyTest {


    public static void main(String[] args) {

        try {
            Person obj = (Person)new CustomMeipo().getInstance(new Lisi());
            System.out.println(obj.getClass());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
