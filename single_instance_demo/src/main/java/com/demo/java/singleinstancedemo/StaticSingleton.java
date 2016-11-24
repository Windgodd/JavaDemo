package com.demo.java.singleinstancedemo;

/**
 * Created by apple on 2016/11/24.
 */
public class StaticSingleton {
    /**
     * 第三种
     *
     * 使用内部类来维护单例的实例
     * 当SingleInstanceCompare被加载时，内部类并没有被初始化
     * getInstanceThree被调用时才会加载SingleHolder从而初始化instanceThree
     * 实例的建立在类加载时完成所以对线程友好，因此不需要使用同步关键字
     */
    private static class SingleHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }
    public static StaticSingleton getInstanceThree(){

        return SingleHolder.instance;
    }
}
