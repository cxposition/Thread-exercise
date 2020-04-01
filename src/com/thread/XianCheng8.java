package com.thread;

import java.util.LinkedList;

/**
 * @author cx
 * @Time 2020/3/31 17:32
 * @Description 生产者 消费者 同步问题
 */
public class XianCheng8 {
    public static void main(String[] args)
    {
        Consumer c1=new Consumer();
        Producer p1=new Producer();
        p1.start();
        c1.start();
    }
}
class CangKu
{
    int empty=10;
   public static LinkedList<Object> storage=new LinkedList<Object>();

    public void producer()
    {
        synchronized (storage)
        {
            storage.notifyAll();
            while (storage.size()==empty)
            {
                System.out.println("当前仓库已经存满，请稍后再试！！！");
                try
                {
                    storage.wait();
                }catch (Exception e)
                {
                    System.out.println("异常:"+e);
                }
            }
            storage.add(new Object());
            System.out.println("生产了一个物品，当前仓库共有"+storage.size()+"件产品！");
//            storage.notifyAll();

        }
    }
    public void consumer()
    {
        synchronized (storage)
        {
            storage.notifyAll();
            while (storage.size()==0)
            {
                System.out.println("东西已经卖完啦，工人们正在尽力生产！");
                try
                {
                    storage.wait();
                }catch (Exception e)
                {
                    System.out.println("异常："+e);
                }
            }
            storage.remove();
            System.out.println("消费了一个物品，当前仓库剩下"+storage.size()+"件产品！");
//            storage.notifyAll();
        }
    }
}
class Producer extends Thread
{
    CangKu ck=new CangKu();
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            ck.producer();

        }

    }
}
class Consumer extends Thread
{
    CangKu ck=new CangKu();
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            ck.consumer();
        }

    }
}
