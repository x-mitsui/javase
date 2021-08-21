/**
 * 关于线程的优先级
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(1);
        System.out.println("最高优先级:"+Thread.MAX_PRIORITY);
        System.out.println("最低优先级:"+Thread.MIN_PRIORITY);
        System.out.println("默认优先级:"+Thread.NORM_PRIORITY);
        System.out.println("主线程优先级:"+Thread.currentThread().getPriority());
        MyRunnable5 myRunnable5 = new MyRunnable5();
        Thread t = new Thread(myRunnable5);
        t.setPriority(10);
        t.start();

        // 大概率倾向于给优先级高的多分事件片
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }

    }
}

class MyRunnable5 implements Runnable{
    // run方法当中的异常不能throws只能try...catch, 因为run方法在父类中没有抛出任何异常, 因为子类不能比父类抛出更多异常
    @Override
    public void run() {
        System.out.println("该线程优先级:"+Thread.currentThread().getPriority());
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }


}
