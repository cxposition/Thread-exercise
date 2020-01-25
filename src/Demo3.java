import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author cx
 * @Time 2020/1/19 16:02
 * @Description 有返回值的线程
 */
public class Demo3 implements Callable<Integer>{

    public static void main(String[] args) throws Exception{
        Demo3 d1 = new Demo3();

        FutureTask<Integer> tasks = new FutureTask<Integer>(d1);
        Thread t = new Thread(tasks);
        t.start();

        System.out.println("我先干点别的！");
        Integer result = tasks.get(); //
        System.out.println("线程执行的结果拿到线程的返回结果为：" + result);
    }
    public Integer call() throws Exception{
        System.out.println("正在进行紧张的计算。。。。。。");
        Thread.sleep(3000);
        return 1;
    }
}
