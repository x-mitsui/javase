/**
 * 关于线程的sleep方法:
 *      static void sleep(long millis)
 *      1. 静态方法
 *      2. 参数是毫秒
 *      3. 让当前进程进入休眠, 进入"阻塞状态", 放弃占有的CPU时间片, 让给其它线程抢占
 *          在A线程中, 就A休眠
 *          在B线程中, 就B休眠
 *      4. Thread.sleep可以做到间隔执行代码
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        // 当前线程是主线程, 让主线程进入休眠5s
        /*
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello world");
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            // 睡眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


