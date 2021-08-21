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
//        synchronized (act){//这种方法也可以, 只不过扩大了同步的范围, 效率更低了; 这里不能写this哟,知道为什么么,因为这里的this不是共享对象

            act.withdraw(money);
//        }


    }
}
