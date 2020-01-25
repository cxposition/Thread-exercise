/**
 * @author cx
 * @Time 2020/1/20 12:38
 * @Description
 */
public class Demo0 extends Thread {
    @Override
    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName()+"执行了！");
        }
    }
    public static void main(String[] args) {
        Demo0 d = new Demo0();
        d.start();
    }
}
