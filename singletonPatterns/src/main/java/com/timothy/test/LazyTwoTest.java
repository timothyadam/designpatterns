package com.timothy.test;

import com.timothy.lazy.LazyOne;
import com.timothy.lazy.LazyTwo;

/**
 * Created by wangxin on 2018/6/7.
 */
public class LazyTwoTest {


    public static void main(String[] args) {
        int  count =2000000;
        //CountDownLatch countDownLatch = new CountDownLatch(count);
        long start= System.currentTimeMillis();
        for(int i=0;i<count;i++){
//            new Thread(){
//                @Override
//                public void run() {
//                }
//            }.start();
            //countDownLatch.countDown();
            //System.out.println();
            LazyTwo.getNewInstance();
            System.out.println(LazyTwo.getNewInstance());

        }
        long end = System.currentTimeMillis();

        System.out.println("耗时=="+(end-start));

    }




}
