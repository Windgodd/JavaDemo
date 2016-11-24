package com.demo.java.singleinstancedemo;

/**
 * Created by apple on 2016/11/24.
 */
public class LazySingleton {
    /**
     * 第二种
     * 采用延时加载机制
     *与第一种相比：多线程下较前第一种慢
     */

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance(){
        if ( instance == null ){
            instance = new LazySingleton();
        }

        return instance;
    }
}
