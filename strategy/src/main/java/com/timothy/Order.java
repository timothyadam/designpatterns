package com.timothy;

/**
 * 订单类
 * 策略模式 有固定的算法 仅供客户选择
 * Created by wangxin on 2018/6/13.
 */
public class Order {

    private  String orderNo;

    private  String uuid;

    private  Double amount;

    public Order(String orderNo, String uuid, Double amount) {
        this.orderNo = orderNo;
        this.uuid = uuid;
        this.amount = amount;
    }

    //支付发时候需要用户信息   金额
    public  PayState  pay(PayType payType){

         return payType.getPayMent().getPayMent(this.uuid,this.amount);
    }




}
