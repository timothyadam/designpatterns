package com.timothy.registry;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记注册式
 * Created by wangxin on 2018/6/14.
 */
public class registryMap {



    private static Map<String,Object> registmap= new HashMap<String,Object>();


    private registryMap(){}

    public static registryMap getInstance(String name) throws IllegalAccessException, InstantiationException {

        if(name==null){
          name=registryMap.class.getName();
        }

        if(registmap.get(name)==null){

            registmap.put(name,registryMap.class.newInstance());

        }

        return (registryMap) registmap.get(name);
    }




}
