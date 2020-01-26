package com.sequence;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author cx
 * @Time 2020/1/26 9:32
 * @Description 解决线程安全性问题的方法  原子类
 * ①原子更新基本类型
 * ②原子更新数组
 * ③原子更新抽象类型
 * ④原子更新字段
 */
public class Sequence {
    private AtomicInteger value = new AtomicInteger(0);

    public int getNext()
    {
        return value.getAndIncrement();
    }

    public static void main(String[] args)
    {
        Sequence s = new Sequence();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    System.out.println(Thread.currentThread().getName() + " "+s.getNext());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    System.out.println(Thread.currentThread().getName() + " "+s.getNext());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
