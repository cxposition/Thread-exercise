import java.util.List;

/**
 * @author cx
 * @Time 2020/1/19 16:31
 * @Description lambda 表达式创建线程
 * psvm 创建主函数
 * sout 创建 System.out.println()
 * fori 创建一个for循环
 * foreach 创建一个foreach循环
 */
public class Demo6 {

    private static int a = 0;
//    public int add(List<Integer> values){
//        return values.parallelStream().mapToInt(a -> a).sum();
//    }
    public static synchronized int getName(){
            return a++;
    }
    public static void main(String[] args)
    {
        /**lambda表达式创建线程*/
        new Thread(() -> System.out.println(Thread.currentThread().getName()+"-----"+Demo6.getName())).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println(Thread.currentThread().getName()+":"+ Demo6.getName());
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println(Thread.currentThread().getName()+":"+ Demo6.getName());
                }
            }
        }).start();
    }
}
