package com.timothy.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangxin on 2018/6/10.
 */
public class Meipoproxy  implements InvocationHandler {


      private   Lisi lisi;

      public Meipoproxy (Lisi lisi){

          this.lisi=lisi;

      }


     public Meipoproxy getInstance(){


          return  null;
     }


    public  void findLove(){


           this.lisi.findLove();
        System.out.println();

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是媒婆 帮你找对象  开始物色");
        System.out.println("已经找到了");


        return null;
    }
}
