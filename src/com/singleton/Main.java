package com.singleton;

/**
 * @author cx
 * @Time 2020/1/20 12:05
 * @Description 单例模式
 *
 * 出现线程安全问题应该满足三种情况
 * ①多线程的环境下
 * ②必须有共享资源
 * ③对资源进行非原子性操作
 */
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
