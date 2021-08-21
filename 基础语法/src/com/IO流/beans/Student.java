package com.IO流.beans;

import java.io.Serializable;
//java虚拟机看到这个接口, 会为该类自动生成一个序列化版本号
public class Student implements Serializable {
    // Java虚拟机看到Serializable接口之后, 会自动生成一个序列化版本号
    // 这里没有写出来,java虚拟机会默认提供这个序列化版本号
    int age;

    String name;
    float weight;
    private static final long serialVersionUID= 1L;
    //过了很久,Student这个类源码改动了,
    // 源码改动之后, 需要重新编译, 编译之后生成了全新的字节码文件
    // 并且class文件再次运行的时候,java虚拟机生成的序列化版本号也会相应的进行改变

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
