package com.timothy.proxy.custom;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * Created by wangxin on 2018/6/19.
 */
public class TClassLoader extends ClassLoader {

    private File classPathFile;



    //构造函数
    public  TClassLoader(){
    String classPath=TClassLoader.class.getResource("").getPath();
    this.classPathFile=new File(classPath);
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

     String className=TClassLoader.class.getPackage().getName()+"."+name;
     System.out.println(className);
     if(className!=null){
         File classFile=new File(classPathFile,name.replaceAll("\\.","/")+".class");
         if(classFile.exists()){
             try {
                 FileInputStream  in= new FileInputStream(classFile);
                 ByteOutputStream out= new ByteOutputStream();
                 byte [] buff = new byte[1024];
                 int len;
                     while ((len=in.read(buff))!=-1){

                         out.write(buff,0,len);
                     }
                    return  defineClass(className,out.getBytes(),0,out.size());
             } catch (Exception e) {
                 e.printStackTrace();
             }


         }
     }


        return null;
    }
}
