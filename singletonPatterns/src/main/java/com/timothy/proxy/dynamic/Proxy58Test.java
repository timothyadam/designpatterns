package com.timothy.proxy.dynamic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by wangxin on 2018/6/10.
 */
public class Proxy58Test {

    public static void main(String[] args) throws IOException {

          Person p =(Person) new Proxy58().getInstance(new Lisi());
          p.findJob();


        //JDK中有个规范，只要要是$开头的一般都是自动生成的

        //通过反编译工具可以查看源代码
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("/Users/$Proxy0.class");
        os.write(bytes);
        os.close();



    }

}
