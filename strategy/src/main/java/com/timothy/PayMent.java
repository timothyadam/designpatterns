package com.timothy;

/**
 * 支付方式
 * Created by wangxin on 2018/6/14.
 */
public interface PayMent {

   PayState getPayMent(String uuid ,double amount);
}
