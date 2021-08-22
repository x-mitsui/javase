package Thread;

/**
 * 1. 怎么获取线程对象
 *       Thread.currentThread()
 * 2. 获取线程对象的名字
 *      线程对象.getName()
 * 3. 修改线程对象的名字
 *      线程对象.setName(newName)
 * 4. 线程默认的名字规律: Thread-n
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        // 当前线程, 当前在main方法内,所以当前线程为主线程
        Thread cur_thread = Thread.currentThread();
        // 创建线程对象
        MyThread02 t = new MyThread02();
        // 设置线程的名字
        t.setName("ttt");
        // 获取线程的名字
        String tName = t.getName();
        System.out.println(tName);
        // 启动线程
        t.start();

        MyThread02 t2 = new MyThread02();
        System.out.println(t2.getName());//打印线程的默认名字


    }
}
class MyThread02 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // 当t1线程执行, 当前线程就是t1
            // 当t2线程执行, 当前线程就是t2
            // 哪个线程调用就是哪个线程
            Thread cur_thread = Thread.currentThread();
            System.out.println(cur_thread.getName()+"线程分支--->"+i);
            // 下面的有局限性
//            System.out.println(this.getName()+"线程分支--->"+i);
//            System.out.println(super.getName()+"线程分支--->"+i);
        }
    }
}
