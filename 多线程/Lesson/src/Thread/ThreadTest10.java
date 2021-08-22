package Thread;

/**
 * 关于线程的让位,当前运行的线程暂停,回到就绪状态,让给其它线程
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable6());
        t.setName("t");
        t.start();

        // 大概率倾向于给优先级高的多分事件片
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }

    }
}

class MyRunnable6 implements Runnable{
    // run方法当中的异常不能throws只能try...catch, 因为run方法在父类中没有抛出任何异常, 因为子类不能比父类抛出更多异常
    @Override
    public void run() {
        System.out.println("该线程优先级:"+Thread.currentThread().getPriority());
        for (int i = 0; i < 10000; i++) {
            if(i % 100==0){ //99 199 299这些地方让
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }


}
