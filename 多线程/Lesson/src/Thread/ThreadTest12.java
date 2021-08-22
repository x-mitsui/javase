package Thread;

/**
 * 守护线程
 */
public class ThreadTest12 {
    public static void main(String[] args) {
        Thread t = new BackupThread();
        t.setName("备份数据的线程");

        t.setDaemon(true);// 启动线程之前, 将线程设置为守护线程, Daemon:古希腊神话守护神
        t.start();

        // 主线程: 用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----->"+(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BackupThread extends Thread{
    public void run(){
        int i=0;
        // 即使是死循环, 但由于该线程是守护者, 当用户线程结束, 守护线程自动终止
        while (true){
            System.out.println(Thread.currentThread().getName()+"----->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
