package Thread;

/**
 * 在java中如何合理地终止一个线程的执行, 这种方式很常用的
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        MyRunnable4 myRunnable4 = new MyRunnable4();
        Thread t = new Thread(myRunnable4);
        t.start();

        //希望5秒钟后t线程醒来
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5秒后终止线程
        myRunnable4.runFlag=false;
    }
}

class MyRunnable4 implements Runnable{
    // 打一个布尔标记
    boolean runFlag = true;
    // run方法当中的异常不能throws只能try...catch, 因为run方法在父类中没有抛出任何异常, 因为子类不能比父类抛出更多异常
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(runFlag){
                System.out.println(Thread.currentThread().getName()+"线程分支"+i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                // return结束之前可以在这里保存数据
                // saveDatas()
                return;
            }

        }

    }

    // 非继承方法可以throws
    public void doOther() throws Exception{

    }
}
