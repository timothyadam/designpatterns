package com.timothy.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * Created by wangxin on 2018/6/17.
 */
public class CglibMeiPo  implements MethodInterceptor {


   public Object getInstance(Class<?> classp)throws  Exception{
       Enhancer enhancer= new Enhancer();
       //设置父类
       enhancer.setSuperclass(classp);

       enhancer.setCallback(this);

       return enhancer.create();

   }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----------开始拦截---------");
        methodProxy.invokeSuper( o,objects);
        System.out.println("----------结束调用拦截---------");

        return null;
    }
}
