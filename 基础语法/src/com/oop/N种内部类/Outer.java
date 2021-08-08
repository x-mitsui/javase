package com.oop.N种内部类;

public class Outer {
    private int id;
    public void out(){
        System.out.println("这是外部类方法");
    }

    class Inner{
        public void in(){
            System.out.println("这是内部类方法:");
            System.out.println("获取外部类的私有属性:"+id);
        }
    }

    // 方法内可以写class
    public void localClass(){
        class InnerLocalClass{

        }
    }
}

// 一个java类可以有多个class文件,但是只能有一个public class
