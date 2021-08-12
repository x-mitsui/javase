package com.oop.抽象类;

// 抽象类是引用数据类型
// 抽象类无法实例化
// 抽象类的子类可以是抽象类
// final和abstract无法共用
// 抽象类虽然无法实例化,但是抽象类有构造方法,供子类使用
// 抽象类不一定有抽象方法,抽象方法必须出现在抽象类里
// 非抽象类继承抽象类必须实现抽象方法,抽象类继承抽象类可以不实现抽象方法
// Java语言中没有方法体的方法都是抽象方法?

public abstract class Action {
    // 抽象方法,只有方法名字,没有方法实现
    public abstract void start();

    // 抽象类内可以写普通方法
    public void end(){

    };


    Action(){
        System.out.println("抽象类构造函数");
    }
}
