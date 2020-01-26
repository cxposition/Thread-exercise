/**
 * @author cx
 * @Time 2020/1/25 15:46
 * @Description volatile 称之为轻量级锁，被volatile修饰的变量，在线程之间是可见的。
 * 可见：一个线程修改了这个变量的值，在另一个线程中能够读到这个修改后的值
 * synchronized除了线程之间互斥之外，还有一个非常大的作用，就是保证可见性
 *
 * 保证可见性的前提是多个线程拿到的是同一把锁。
 */
public class Demo8 {

    private int a = 1;

    public synchronized int getA() {
        return a;
    }

    public synchronized void setA(int a) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.a = a;
    }

    public static void main(String[] args)
    {
        Demo8 demo8 = new Demo8();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo8.setA(10);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                demo8.getA();
            }
        }).start();
        System.out.println("最终的结果为：" + demo8.getA());
    }

}
