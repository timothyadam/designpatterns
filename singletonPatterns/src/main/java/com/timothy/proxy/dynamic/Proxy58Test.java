package com.timothy.proxy.dynamic;

/**
 * Created by wangxin on 2018/6/10.
 */
public class Proxy58Test {

    public static void main(String[] args) {

      Person p =(Person) new Proxy58().getInstance(new Lisi());
      p.findJob();

    }

}
