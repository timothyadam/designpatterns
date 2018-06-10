package com.timothy.lazy;

/**
 * Created by wangxin on 2018/6/7.
 */
public class LazyThree {

    private static  boolean initialize =false;

    private LazyThree(){

        synchronized (LazyThree.class){
            if(initialize==false){
            initialize=!initialize;
            }else {
                System.out.println("已被侵入");
            }
        }


    }




  public   static final LazyThree getNewInstance(){
        return  lazyholder.lazy;
  }

    private static class  lazyholder{
        private static final LazyThree lazy= new LazyThree();
    }


}
