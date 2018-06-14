package com.timothy;

/**
 * Created by wangxin on 2018/6/14.
 */
public enum PayType {
    ALI_PAY (new AliPay()),
    JD_PAY(new JDPay()),
    Union_PAY(new UnionPay()),
    WECHAT_PAY(new WechatPay()),
    APPLE_PAY(new ApplePay())
    ;
    private PayMent payMent;

    PayType(PayMent payMent) {
        this.payMent=payMent;
    }


    public PayMent getPayMent(){
        return  this.payMent;
    }


}
