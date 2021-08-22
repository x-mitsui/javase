/**
 * 合并线程
 */
public class ThreadTest11 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread t = new Thread(new MyRunnable7());
        t.setName("t");
        t.start();
        try {
            // 合并线程, 当前线程受阻, t线程执行, 直到结束
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");




    }
}

class MyRunnable7 implements Runnable{
    // run方法当中的异常不能throws只能try...catch, 因为run方法在父类中没有抛出任何异常, 因为子类不能比父类抛出更多异常
    @Override
    public void run() {
        System.out.println("该线程优先级:"+Thread.currentThread().getPriority());
        for (int i = 0; i < 10000; i++) {

            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }


}
