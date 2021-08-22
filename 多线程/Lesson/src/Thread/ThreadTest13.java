package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;// JUC包下的, 属于java的并发包, 老JDK中没有这个包. 新特性

/**
 * 实现线程的第三种方式: 实现Callable接口
 * 优点: 可以获取到线程的执行结果, 可以添加异常
 * 缺点: 效率较低, 在获取t线程执行结果的时候, 当前线程受阻塞, 效率较低
 */
public class ThreadTest13 {
    public static void main(String[] args) {
        // 创建一个"未来任务类"对象
        // 参数非常重要, 需要给一个Callable接口的实现类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {// call方法相当于run方法, 只不过有返回值
                // 线程执行一个任务, 执行之后可能会有一个结果
                // 模拟执行
                System.out.println("call method begin");
                Thread.sleep(10*1000);
                System.out.println("call method end");
                int a =100;
                int b=100;

                return a + b;
            }
        });

        // 创建线程对象
        Thread t =new Thread(task);

        // 启动线程
        t.start();

        // 现在处于main方法,主线程中
        // 如何获取t线程的执行结果
        // get()方法的执行会导致当前线程阻塞
        try {
            Object obj = task.get();
            System.out.println("线程执行结果-->"+obj);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        // main方法这里的程序要执行必须等待get()方法的结束
        // 而get()方法可能需要很久. 因为get()方法时为了拿另一个线程的执行结果
        // 另一个线程执行是需要时间的.
        System.out.println("Hello World!");
    }
}
