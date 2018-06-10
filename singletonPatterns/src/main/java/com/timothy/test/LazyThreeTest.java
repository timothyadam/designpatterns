package com.timothy.test;

import com.timothy.lazy.LazyThree;
import sun.font.TrueTypeFont;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wangxin on 2018/6/8.
 */
public class LazyThreeTest {


      public static void main(String[] args) {

      Class<?> classz =LazyThree.class;
          try {
              Constructor constructor=classz.getDeclaredConstructor(null);
              constructor.setAccessible(true);
              Object obj=constructor.newInstance();
              for(int  i=0;i<20;i++){
                 // System.out.println(classz.newInstance());
                  new Thread(){

                      @Override
                      public void run() {

                          System.out.println();

                      }
                  }.start();


              }



                // System.out.println(classz.newInstance());
//                 Method method= classz.getMethod("getNewInstance");
//                 Object obj= method.invoke(classz.newInstance());
//                 Field field= classz.getDeclaredField("initialize");
//                 field.setAccessible(true);
//                 field.setBoolean(field,false);
//                 System.out.println(classz.newInstance());


                // System.out.println(field.get("initialize"));



//              classz                                                    .newInstance();
//              System  Object obj= LazyThree.getNewInstance();           .out.println(classz.newInstance());
//             Constru   System.out.println(obj);                         ctor constructor= classz.getDeclaredConstructor(null);
//             constructor.setAccessible(true);
//             Object obj=constructor.newInstance();
//             System.out.println(obj);
           ;
           
           
           

           
           
//
//              System.out.println(classz);
              
            //  classz.
              


          } catch (Exception e) {
              e.printStackTrace();
          }


      }




}
