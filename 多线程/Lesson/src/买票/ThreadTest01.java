package 买票;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/13 - 07 - 13 - 10:14
 * @Description: 买票
 * @version: 1.0
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread mt0 = new MyThread();
        mt0.start();
        MyThread mt1 = new MyThread();
        mt1.start();
        MyThread mt2 = new MyThread();
        mt2.start();


    }
}
