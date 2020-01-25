/**
 * @author cx
 * @Time 2020/1/19 15:44
 * @Description 实现Runnable接口
 */
public class Demo1 implements Runnable{

    @Override
    public void run(){
        while (true){
            System.out.println("Thread running....");
        }
    }
    public static void main(String[] args){
        Thread d1 = new Thread(new Demo1());
        d1.start();
    }
}
