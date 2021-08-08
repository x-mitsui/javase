package com.oop.抽象类;

public class Application {
    public static void main(String[] args) {
        // 抽象类不能实例化,继承的实现了抽象函数的类可以实例化
        Action a = new A();

    }
}

//普通类: 只有具体实现
//抽象类: 具体实现和规范(抽象方法)都有
//接口: 只有规范,专门用来约束,本质上一种契约