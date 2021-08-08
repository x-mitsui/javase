package com.oop.override;

public class Application {
    public static void main(String[] args) {
        Person p = new Person();
        p.test();
        Person t = new Teacher();
        t.test();

        System.out.println("--------------");
        p.overrideFunc();
        t.overrideFunc();

        /*
        * 重写标准:
        * 只有非静态方法才有子类重写
        * 方法名必须相同
        * 参数列表必须相同
        * 修饰符:范围可以扩大但不可以缩小 public > protected > default > private
        * 抛出的异常:范围可以缩小,但不能扩大
        *
        * 为什么需要重写:
        * 子类不一定需要那么多功能,或者不满足子类需求
        *
        * 可以通过快捷键重写 ctrl + Enter
        *
        * */

    }
}
