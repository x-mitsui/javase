/**
 * sleep睡眠太久了, 如果希望它马上醒了, 你应该怎么办? 也就是如何叫醒一个正在睡眠的线程
 *  注意: 这个不是终止线程的运行, 而是终止睡眠
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread t = new Thread(myRunnable2);
        t.start();

        //希望5秒钟后t线程醒来
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 终止t的睡眠(这种中断睡眠的方式依靠了java的异常处理方式)
        t.interrupt();// 叫醒!

    }
}

class MyRunnable2 implements Runnable{
    // run方法当中的异常不能throws只能try...catch, 因为run方法在父类中没有抛出任何异常, 因为子类不能比父类抛出更多异常
    @Override
    public void run() {

            Thread cur_thread = Thread.currentThread();
            System.out.println(cur_thread.getName()+"线程分支--->begin");
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            System.out.println("打印异常信息~~~~~");
            e.printStackTrace();
        }
        // 一年之后才执行这里
        System.out.println(cur_thread.getName()+"线程分支--->end");
    }

    // 非继承方法可以throws
    public void doOther() throws Exception{

    }
}
