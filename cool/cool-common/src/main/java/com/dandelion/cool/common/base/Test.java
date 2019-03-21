package com.dandelion.cool.common.base;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/**
 * @author: Mr.QinJiang
 * @create: 2019-03-13 13:50
 * @description: 测试新map
 **/
public class Test {


    public static void main(String[] args) {
        ConcurrentMap map=new ConcurrentHashMap(16);
        for (int i=1;i<10;i++){
            map.put("key"+i,"val+*"+i);
        }
        Executor executor= command -> {

        };
        ConcurrentHashMap.KeySetView<String,String> view= (ConcurrentHashMap.KeySetView<String, String>) map.keySet();

    }
}
