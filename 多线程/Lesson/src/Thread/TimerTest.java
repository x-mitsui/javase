package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
使用定时器创建定时任务
 */
public class TimerTest {
    public static void main(String[] args) {
        // 创建定时器对象
        Timer timer = new Timer();
//        Timer timer = new Timer(true);// 守护线程的方式
        //指定定时任务
//        timer.schedule(定时任务,第一次执行时间,间隔多久执行一次);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = null;
        try {
            firstTime = sdf.parse("2021-08-22 15:52:50");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(new LogTimerTask(), firstTime, 1000*10);
        /* 匿名内部类方式
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // 编写你要执行的任务就行了
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strTime = sdf.format(new Date());
                System.out.println(strTime+":成功完成了一次数据备份!");
            }
        }, firstTime, 1000 * 10);

         */
    }
}

// 编写一个定时任务类
// 假设这是一个记录日志的定时任务
// TimerTask继承Runnable
class LogTimerTask extends TimerTask{
    @Override
    public void run() {
        // 编写你要执行的任务就行了
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime+":成功完成了一次数据备份!");
    }
}