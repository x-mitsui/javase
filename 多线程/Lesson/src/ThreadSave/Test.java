package ThreadSave;

public class Test {
    public static void main(String[] args) {
        // 创建账户对象
        Account act = new Account("act-001", 10000);
        // 创建两个对象
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
