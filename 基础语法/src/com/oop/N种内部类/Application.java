package com.oop.N种内部类;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // 通过外部类实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();

        // 匿名类
        new NoName().test();

        UserService userService = new UserService() {
            @Override
            public void hello() {

            }
        };
    }
}

class NoName{
    void test(){}
}

interface UserService{
    void hello();
}
