package com.timothy.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wangxin on 2018/6/10.
 */
public class Meipoproxy  implements InvocationHandler {


      private   Person targart;

     public  Object getInstance(Person targart){

         this.targart=targart;
         Class<?> clazz=targart.getClass();
         return   Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

     }





    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是媒婆 帮你找对象  开始物色");
        System.out.println("已经找到了");
        System.out.println("谈吧  ");
        method.invoke(this.targart,args);
              System.out.println("双方家里同意 ");
        System.out.println("办事 ");
        return null;
    }
}
