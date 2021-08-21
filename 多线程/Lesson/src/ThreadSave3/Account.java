package ThreadSave3;

/**
 * 银行账户
 * 使用线程同步机制, 来解决线程安全问题
 */
public class Account {
    // 账号
    private String actno;
    // 余额
    private double balance;
    //
    Object obj = new Object();

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println(Thread.currentThread().getName() + "对账户" + actno + "取款成功,余额:" + balance);
    }

    // 取款的方法

    /**
     * 在实例方法中使用synchronized,
     * 缺点: 锁的一定是this, 没的挑, 所以这种方式不灵活
     *  而且synchronized出现实例方法上, 整个方法体都需要同步, 可能会导致效率降低, 所以这种方法不常用
     * 优点: 代码会少一点
     * 如果共享的对象是this, 并且需要同步的代码块是整个方法体, 建议使用这种方式 ,可以看一下StringBuffer(线程安全的)
     * @param money
     */
    public synchronized void withdraw(double money) {
        double before = this.getBalance();
        double after = before - money;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setBalance(after);

    }
}
