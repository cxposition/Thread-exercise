/**
 * @author cx
 * @Time 2020/1/25 14:45
 * @Description synchronized 锁关键字练习
 *
 * @note 可以用jconsole去监视锁的状态，检测死锁
 */
public class Demo7 {

    private Object obj1 = new Object();
    private Object obj2 = new Object();

    public void b()
    {
        synchronized (obj2)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1)
            {
                System.out.println("a");
            }
        }
    }

    public void a()
    {
        synchronized (obj1)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2)
            {
                System.out.println("b");
            }
        }
    }

    public static void main(String[] args)
    {

        Demo7 d = new Demo7();
        new Thread(new Runnable() {
            @Override
            public void run() {
                d.a();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.b();
            }
        }).start();
    }

}
