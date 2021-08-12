package p05_example;

//
public class Race implements Runnable{
    private static String winner;
    private static int executeTimes = 0;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            executeTimes++;
            if (Thread.currentThread().getName().equals("兔子")&&i%10==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (getOver(i)){
                System.out.println(winner+"获得了胜利");
                System.out.println("程序执行了"+executeTimes+"次");
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了第"+i+"步");
        }
    }

    private static boolean getOver(int steps){
        if (winner !=null){
            return true;
        }
        if((steps>=100)){
            winner = Thread.currentThread().getName();
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"乌龟").start();
        new Thread(race,"兔子").start();
    }
}
