package p01_createThread;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println("watching>>>>>"+i);
        }
    }

    public static void main(String[] args) {
        //main线程(主线程)
        for (int i = 0; i < 10000; i++) {
            System.out.println("eating------"+i);
        }

        // 创建线程对象
        ThreadTest t = new ThreadTest();

        // 调用start()方法开启线程
        t.start();
    }
}
