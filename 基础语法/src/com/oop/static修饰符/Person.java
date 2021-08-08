package com.oop.static修饰符;

public class Person {
    private static int _age;// 静态变量
    private double _score;// 非静态变量
    public static void run(){// 静态方法
        System.out.println("run");
    }
    public void go(){ // 非静态方法
        System.out.println("go");
        System.out.println(_age);// 2
        System.out.println(Person._age);// 3
        run(); // 2
        Person.run(); // 3
    }

    /*
     * 类内部:
     * 非静态方法只能通过实例调用
     * 非静态方法可以调用直接静态方法(2),也可以通过Teacher类调用(3)
     * 静态方法不能直接调用非静态方法
     * */

    {
        //(匿名)代码块
        System.out.println("匿名代码块");
    }
    static {
        //静态代码块
        System.out.println("静态代码块");
    }
    public Person(){
        System.out.println("构造方法");
    }
    /*
    * 执行顺序:静态代码块(只在第一次执行, 以后不重复执行)->(匿名)代码块->构造方法
    * */
}
