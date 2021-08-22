package Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 使用wait和notify方法实现"生产者和消费者"模式
 * 2. 什么是"生产者和消费者模式"?
 *  生产线程负责生产, 消费线程负责消费.
 *  生产线程和消费线程要达到均衡
 *  这是一种特殊的业务需求, 在这种特殊的情况下需要使用wait方法和notify方法
 * 3. wait和notify不是线程对象的方法, 是普通java对象都有的方法
 * 4. wait方法和notify方法建立在线程同步的基础上, 因为多线程要同时操作一个仓库, 有线程安全问题
 * 5. wait方法作用: o.wait()让正在o对象上活动的线程t进入等待状态, 并且释放掉t线程之前占有的o对象的锁
 * 6. notify作用:o.notify()让正在o对象上等待的线程唤醒, 只是通知, 不会释放o对象上之前占有的锁
 * 7. 模拟这样一个需求:
 *  仓库采用List集合
 *  List集合中假设只能存储1个元素
 *  1个元素就表示仓库满了
 *  如果List集合中元素个数是0, 就表示仓库空了
 *  保证List集合中永远最多存储一个元素
 *
 *  必须做到这种效果:生产一个消费一个
 */
public class ThreadTest14 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread tpro = new Thread(new Producer(list));
        Thread tCon = new Thread(new Consumer(list));
        tpro.setName("生产者线程");
        tCon.setName("消费者线程");
        tpro.start();
        tCon.start();
    }
}

// 生产线程
class Producer implements Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 一直生产(使用死循环模拟一直生产)
        while(true){
            // 给仓库对象list加锁
            synchronized (list){
                if (list.size()>0){// 说明仓库已满
                    try {
                        list.wait();// 当前线程进入等待状态, 并且释放集合list的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 程序能执行到这里, 说明仓库是空的, 可以生产
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"---->"+obj);

                // 唤醒消费者进行消费
                list.notify();//list.notifyAll();
            }
        }
    }
}
// 消费线程
class Consumer implements Runnable{
    private List list;
    public Consumer(List list) {
        this.list = list;
    }
    @Override
    public void run() {
        // 一直消费
        while(true){
            // 给仓库对象list加锁
            synchronized (list){
                if (list.size()==0){// 说明仓库已空
                    try {
                        list.wait();// 当前线程进入等待状态, 并且释放集合list的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 程序能够执行到这一步, 说明仓库中有数据进行消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"删除了"+obj);
                // 唤醒生产者生产
                list.notify();//list.notifyAll();
            }
        }
    }
}