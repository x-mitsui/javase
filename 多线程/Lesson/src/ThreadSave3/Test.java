package ThreadSave3;

public class Test {
    public static void main(String[] args) {
        // 创建账户对象
        Account act = new Account("act-001", 10000);
        Account act2 = new Account("act-002", 20000);
        // 创建两个对象
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        Thread t3 = new AccountThread(act2);// t3取款,t1,t2不受t3干扰
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
