package Thread;

/**
 * 实现线程的第二种方式
 *
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        // 创建一个可运行的对象
        MyRunnable myRunnable = new MyRunnable();
        // 将可运行的对象封装成一个线程对象
        Thread t = new Thread(myRunnable);
        t.start();
        /* 匿名内部类方式: "new [匿名] implements Runnable"
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("积极急急急你--->"+i);
                }
            }
        });
        t2.start();
         */
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}
// 这并不是一个线程类, 是一个可运行的类, 它不是一个线程.
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("线程分支--->"+i);
        }
    }
}

