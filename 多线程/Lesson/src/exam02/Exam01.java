package exam02;
// t2的doOther会等待t1的doSome么
public class Exam01 {

    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        Thread t1= new MyThread(mc1);//两个线程两把锁
        Thread t2= new MyThread(mc2);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        try {
            Thread.sleep(1000);//这个睡眠是保证t1线程先执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyClass{
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome end");
    }
    public void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther end");
    }
}

class MyThread extends Thread{
    private MyClass mc;
    public MyThread(MyClass mc){
        this.mc = mc;
    }
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if(Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}
