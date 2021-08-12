package P4_example;
// 多个线程操作同一个对象
// 买火车票的例子
// 多个线程操作同一个资源的情况
public class TestThread4 implements Runnable{
    private int ticketNum = 10;

    @Override
    public void run() {
        while(ticketNum>0){
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"--->拿到了第"+ticketNum--+"票");
        }
    }

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();
        new Thread(testThread4,"小明").start();
        new Thread(testThread4,"老师").start();
        new Thread(testThread4,"黄牛").start();
    }
}

