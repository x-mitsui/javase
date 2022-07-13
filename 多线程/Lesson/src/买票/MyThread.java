package 买票;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/13 - 07 - 13 - 10:14
 * @Description: 买票
 * @version: 1.0
 */
public class MyThread extends Thread{
    public static int ticketNum = 10;
    @Override
    public void run() {
        super.run();
        while (ticketNum-->0){
            System.out.println("买了"+ticketNum+"张票");
        }
    }
}
