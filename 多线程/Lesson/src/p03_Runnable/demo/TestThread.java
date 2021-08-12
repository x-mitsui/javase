package p03_Runnable.demo;

import org.apache.commons.io.FileUtils;
import p01_createThread.ThreadTest;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// 创建线程方法2: 实现Runnable接口, 重写run方法
public class TestThread implements Runnable {
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println("watching>>>>>"+i);
        }
    }

    public static void main(String[] args) {
        //main线程(主线程)

        // 创建实现runnable接口的类对象
        TestThread t = new TestThread();

        // 创建线程对象, 通过线程对象来开启线程
        new Thread(t).start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("eating------"+i);
        }
    }

    /**
     * 对比:
     * 继承Thread类
     * 子类继承Thread具备多线程能力
     * 启动线程: 子类对象.start()
     * 不建议使用: OOP单继承具有局限性
     *
     * 实现Runnable接口
     * 实现接口Runnable接口具备多线程能力
     * 启动线程: 传入目标对象 + new Thread(实现Runnable接口的对象).start()
     * 推荐使用: 避免了单继承局限性, 灵活方便, 方便同一个对象被都多个线程使用
     *
     * */
}
