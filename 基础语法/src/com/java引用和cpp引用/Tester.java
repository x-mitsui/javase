package com.java引用和cpp引用;

public class Tester{
    public static void main(String[] args){
        Integer var1=new Integer(1);
        Integer var2=var1;
        doSomething(var2);
        System.out.print(var1.intValue());
        System.out.print(var1==var2);
        System.out.print(var2.intValue());
    }
    public static void doSomething(Integer integer){// 新建了integer, integer指向了var2指向的地址, 和C++引用不同, 和指针类似
        integer=new Integer(2);// integer指向改变, 不影响var2的指向
    }
}