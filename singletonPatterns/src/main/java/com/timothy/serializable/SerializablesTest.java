package com.timothy.serializable;

import java.io.*;

/**
 * Created by wangxin on 2018/6/14.
 */
public class SerializablesTest {


    public static void main(String[] args) {

    Serializables  s1=null;

    Serializables  s2=Serializables.getInstance();

        FileOutputStream  fos=null;

        try {
            fos= new FileOutputStream("Serializables.obj");
            ObjectOutputStream ops=new ObjectOutputStream(fos);
            ops.writeObject(s2);
            ops.flush();
            ops.close();


            FileInputStream fis= new FileInputStream("Serializables.obj");
            ObjectInputStream oin= new ObjectInputStream(fis);
            s1=(Serializables)oin.readObject();


            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
