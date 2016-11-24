package com.demo.java.singleinstancedemo;

/**
 * Created by wind on 2016/11/24.
 */
/**
 * 第一种
 * 单例模式好处： 对于频繁使用的对象，可以减少对象创建的时间
 * 	降低内存的使用频率，减轻gc压力
 *
 */
public class Singleton {
    /**
     *
     * 因为是static，jvm加载时就被创建，不管是否被用到
     */

    private static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
}
