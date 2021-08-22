/**
 * 在java中如何强行终止一个线程的执行
 * 这种方式存在很大的缺点, 容易丢失数据, 因为这种方式是直接杀死进程.
 * 线程没有保存的数据将会丢失
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        MyRunnable3 myRunnable3 = new MyRunnable3();
        Thread t = new Thread(myRunnable3);
        t.start();

        //希望5秒钟后t线程醒来
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5秒后强制终止
        t.stop();// 已过时,不建议使用
    }
}

class MyRunnable3 implements Runnable{
    // run方法当中的异常不能throws只能try...catch, 因为run方法在父类中没有抛出任何异常, 因为子类不能比父类抛出更多异常
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"线程分支"+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    // 非继承方法可以throws
    public void doOther() throws Exception{

    }
}
