package com.timothy.proxy.custom;

import java.lang.reflect.Method;

/**
 * Created by wangxin on 2018/6/17.
 */
public interface InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable ;

    }
