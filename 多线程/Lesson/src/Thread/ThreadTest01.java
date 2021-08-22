package Thread;

/**
 * 实现继承的第一种方式:
 *      编写一个类, 直接继承java.lang.Thread, 重新run方法
 *
 *      怎么创建线程对象
 *      怎么启动线程对象
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        // main方法属于主线程, 在主线程中运行
        MyThread myThread = new MyThread();
        // 启动, 启动一个分支线程, 在jvm中开辟一个新的栈空间, 这段代码任务完成之后, 瞬间就结束l.
        // 这段代码的任务只是为了开启一个新的栈空间, 只要新的栈空间开出来, start()方法就结束了.线程就启动成功了,
        // 启动成功的线程会自动调用run方法, 且run方法在分支栈的栈底部(压栈), main方法在主栈的栈底部. run和main是平级的
        // 这行代码不执行完, 下面的代码不会执行, 因为java方法体的代码永远都是自上而下的顺序,依次逐行执行的
        myThread.start();

        // myThread.run();如果直接调用run方法, 不会启动线程,且不会分配新的分支栈,是单线程的
        // 这里代码运行在主线程
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // 编写程序, 这段程序运行在分支线程(分支栈)中,
        for (int i = 0; i < 10000; i++) {
            System.out.println("线程分支--->"+i);
        }
    }
}
