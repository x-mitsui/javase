package com.oop.多态;

public class Application {
    public static void main(String[] args) {
        // 一个类的实际对象是确定的,但是引用可以是不同类型,调用方法时查找引用类型,如果引用子类有重写,调用子类方法
        Person p = new Person();
        p.run();
        Person t = new Teacher();
        t.run();
        Person w = new Worker();
        w.run();
        Person d = new Doctor();
        d.run();
//        d.eat();

        System.out.println("--------------");


        /*
        * 注意事项:
        * 多态是方法的多态
        * 存在条件:继承关系, 方法需要重写, 父类引用指向子类对象
        * 不能重写的方法:
        *   static(因为属于类,它不属于实例)
        *   final类不能被继承
        *   private权限,不能访问
        * */

    }
}
