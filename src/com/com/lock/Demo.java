package com.com.lock;

/**
 * @author cx
 * @Time 2020/1/27 13:30
 * @Description 实现锁的不可重入 以及实现锁的可重入
 */
public class Demo {

    Mylock lock = new Mylock();
    public void a(){
        lock.lock();
        System.out.println("a");
        b();
        lock.unlock();
    }

    public void b(){
        lock.lock();
        System.out.println("b");
        lock.unlock();
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.a();
            }
        }).start();
    }
}
