package com.timothy;

/**
 * Created by wangxin on 2018/6/14.
 */
public class ApplePay implements PayMent {
    @Override
    public PayState getPayMent(String uuid, double amount) {
        System.out.println("欢迎使用ApplePay");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功",amount);
    }
}
