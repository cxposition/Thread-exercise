package com.com.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cx
 * @Time 2020/1/26 13:51
 * @Description Lock接口 Lock 需要显示地释放锁，繁琐但能让代码更灵活
 * Synchronized不需要显示地释放和获取锁，简单
 *
 * 使用Lock可以方便的实现公平性
 */
public class Mylock implements Lock {
//    private int value;
//    Lock lock = new ReentrantLock();
//    private Mylock lock = new Mylock();

    private boolean isLocked = false;

    @Override
    public synchronized void lock()
    {
        while (isLocked)
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isLocked = true;
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public synchronized void unlock(){
        isLocked = false;
        notify();
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
