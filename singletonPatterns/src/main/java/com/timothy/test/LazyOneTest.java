package com.timothy.test;

import com.timothy.lazy.LazyOne;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wangxin on 2018/6/7.
 */
public class LazyOneTest {


    public static void main(String[] args) {
        int  count =2000000;
        //CountDownLatch countDownLatch = new CountDownLatch(count);
        long start= System.currentTimeMillis();
        for(int i=0;i<count;i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    System.out.println();
//                }
//            }.start();
            //countDownLatch.countDown();
            LazyOne.getNewInstance();

        }
        long end = System.currentTimeMillis();

        System.out.println("耗时=="+(end-start));

    }




}
