package com.oop.override;

public class Teacher extends Person {

    // 非静态方法, 具有重写效果
    @Override //注释, 有功能的注释
    public void overrideFunc() {
        System.out.println("子类非静态方法");
//        super.overrideFunc();//可通过super调用父类的方法
    }

    // 子类静态方法
    public static void test(){
        System.out.println("子类静态方法");
    }
}
