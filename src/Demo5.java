import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author cx
 * @Time 2020/1/19 16:21
 * @Description 用线程池来创建线程
 */
public class Demo5 {
    public static void main(String[] args){
        /**创建带有10个线程容量的线程池*/
        Executor threadPool = Executors.newFixedThreadPool(10);

        for(int i = 0;i < 100;i++)
        {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

    }
}
