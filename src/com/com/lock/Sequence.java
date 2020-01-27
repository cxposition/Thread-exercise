package com.com.lock;

/**
 * @author cx
 * @Time 2020/1/26 14:00
 * @Description
 */
public class Sequence {
    private Mylock lock = new Mylock();

    private int value = 0;

    public int getNext()
    {
        lock.lock();
        value++;
        lock.unlock();
        return value;
    }

    public static void main(String[] args) {
        Sequence s = new Sequence();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                System.out.println(s.getNext());
            }
        }).start();
    }
}
