package ThreadSave;

/**
 * 银行账户
 *      不使用线程同步机制, 多线程对同一个账户取款, 导致数据安全问题
 */
public class Account {
    // 账号
    private String actno;
    // 余额
    private double balance;

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
        System.out.println(Thread.currentThread().getName()+"对账户"+actno+"取款成功,余额:"+balance);
    }

    // 取款的方法
    public void withdraw(double money){
        // t1和t2并发这个方法(t1和t2是两个栈, 两个栈操作堆中同一个对象)
        // 取款之前的余额
        double before = this.getBalance();
        // 取款之后的余额
        double after = before-money;
        // 模拟网络延迟
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 更新余额,假设t1执行到这里了,还没来的及执行这行代码, t2进程进来执行withdraw代码了,此时一定出问题
        this.setBalance(after);
    }
}
