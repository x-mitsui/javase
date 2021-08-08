package com.oop.抽象类;

public abstract class Action {
    // 抽象方法,只有方法名字,没有方法实现

    public abstract void start();

    // 抽象类内可以写普通方法
    public void end(){

    };

    // 抽象类可以有构造方法
    Action(){
        System.out.println("抽象类构造函数");
    }
}
