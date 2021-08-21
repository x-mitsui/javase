package ThreadSave2;

/**
 * 银行账户
 *      使用线程同步机制, 来解决线程安全问题
 */
public class Account {
    // 账号
    private String actno;
    // 余额
    private double balance;
    //
    Object obj= new Object();

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
        // 以下这几行代码必须是线程排队的, 不能并发
        // 一个线程把这里的代码执行结束之后, 另一个线程才能够进来
        /* 线程同步机制语法
            synchronized (){
                // 线程同步代码块
            }
            synchronized后面()中传的参数,相当关键,必须是多线程共享的数据,才能达到多线程排队

            ()中写什么?
            那要看你想让哪些线程同步,
            假设t1,t2,t3,t4,t5有5个线程
            你只希望t1,t2,t3排队, t4,t5不排队
            你一定要在()中写一个t1,t2,t3共享的对象,而这个对象对于t4,t5来说不共享

            在java语言中, 任何一个对象都有一把锁, 这把锁其实就是标记,(只是把它叫做锁)
            100个对象, 100把锁. 一个对象一把锁

            以下代码执行原理?
                1. 假设t1和t2线程并发, 开始执行以下代码的时候, 肯定有一个先一个后
                2. 假设t1线执行了,遇到了synchronized, 这个时候自动找"synchronized后面共享对象"的对象锁
                  找到之后, 并占有这把锁, 然后执行同步代码块中的程序, 在程序执行过程中一直都是占有
                  这把锁的, 直到同步代码块结束, 这把锁才释放.
                3. 假设t1已经占有这把锁, 此时t2也遇到了synchronized关键字, 也会去占有后面共享对象
                 的这把锁, 结果这把锁被t1占有, t2只能在同步代码块外面等待t1的结束, 直到t1的把同步
                 代码块执行结束了, t1会归还这把锁, 此时t2终于等到这把锁, 然后t2占有这把锁之后, 进
                 入同步代码块执行程序

                 这样就达到了线程排队执行
                 需要注意: 共享对象一定要选好, 这个共享对象一定是你[需要]排队执行的这些线程对象所共享的
         */
        Object obj2= new Object();
        //这里的共享对象是账户对象, this就是账户对象
//        synchronized (obj2){// 因为是局部变量, 两个线程都会各自生成obj2, 而obj2不是共享对象, 两个线程都可以获得锁, 所以又能并发了
//        synchronized (this){ // 这里最好用这个, t1, t2共享这个对象, t3不共享它, t3有自己的对象
//        synchronized ("abc"){ // "abc"在字符串常量池中, 此对象唯一; 所有(t1,t2,t3)线程都会同步, 因为它们共享它
        synchronized (obj){// 括号里只要是共享对象就可以
            double before = this.getBalance();
            double after = before-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.setBalance(after);
        }
    }
}
