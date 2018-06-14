package com.timothy;

/**
 * Created by wangxin on 2018/6/14.
 */
public class PayState {



    private String msg;

    private int code;

    private Object data;


    public PayState(int code, String msg,  Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
}
