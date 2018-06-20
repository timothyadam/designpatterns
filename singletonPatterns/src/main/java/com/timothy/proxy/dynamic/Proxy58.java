package com.timothy.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wangxin on 2018/6/10.
 */
public class Proxy58 implements InvocationHandler {

  private  Person targart;

  public Object getInstance(Person targart){

       this.targart=targart;
       Class<?> clazz=targart.getClass();
       System.out.println(Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this));
       return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

  }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是职业中介 帮你找工作");

        System.out.println("开始投递");
        method.invoke(this.targart,args);
        System.out.println("开始面试");





        return null;
    }
}
