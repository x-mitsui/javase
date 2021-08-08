package com.oop.classDemo01;

public class Teacher extends Person{
    Teacher(){
        super();
        System.out.println("子类构造函数");
    }
    Teacher(int age,float weight){
        super(age,weight);
    }
    public void println(){
        super.println();
        System.out.println("子类方法");
    }
}
