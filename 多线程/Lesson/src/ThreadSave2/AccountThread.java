package ThreadSave2;

public class AccountThread extends Thread{
    // 两线程必须共享同一个账户对象
    private Account act;

    // 通过构造方法传递账户对象
    public AccountThread(Account act){
        this.act=act;
    }

    @Override
    public void run() {
        // 表示取款
        double money = 5000;
        act.withdraw(money);


    }
}
