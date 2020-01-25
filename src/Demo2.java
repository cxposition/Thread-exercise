/**
 * @author cx
 * @Time 2020/1/19 15:52
 * @Description 匿名类实现线程
 */
public class Demo2 {
    public static void main(String[] args){
        new Thread(){
            public void run(){
                System.out.println("thread start......");
            }
        }.start();
    }
}
