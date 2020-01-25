package com.singleton;

/**
 * @author cx
 * @Time 2020/1/20 12:01
 * @Description
 */
public class Singleton {

    //私有化构造方法
    private Singleton(){}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
