package com.IO流.beans;

import java.io.Serializable;
//java虚拟机看到这个接口, 会为该类自动生成一个序列化版本号
public class User implements Serializable {
    int age;
    // transient关键字表示游离的, 不参加序列号
    transient String name;

    public User() {
    }

    public User(int age, String name) {
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
