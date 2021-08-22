package Thread;

/**
 * 关于线程的sleep方法的面试题
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        // 当前线程是主线程, 让主线程进入休眠5s
        Thread t = new MyThread03();
        t.setName("t");
        t.start();

        try {
            // 问题: 这段代码会让线程t进入休眠么
            t.sleep(1000);//在执行的时候还是会转换成Thread.sleep, 所以...(略)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello world");
    }
}

class MyThread03 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Thread cur_thread = Thread.currentThread();
            System.out.println(cur_thread.getName() + "线程分支--->" + i);
        }
    }
}
