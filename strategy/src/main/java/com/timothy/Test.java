package com.timothy;

/**
 * Created by wangxin on 2018/6/14.
 */
public class Test {
    public static void main(String[] args) {


        Order  order= new Order("201815","12121",789.2);
       // order.pay(PayType.APPLE_PAY);
        System.out.println(order.pay(PayType.APPLE_PAY));
    }
}
