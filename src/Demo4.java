import java.util.Timer;
import java.util.TimerTask;

/**
 * @author cx
 * @Time 2020/1/19 16:15
 * @Description 定时器实现线程
 */
public class Demo4 {
    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //实现定时任务
                System.out.println("Timer task is run");
            }
        },0,1000);
    }
}
