package com.oop.多态;

public class Doctor extends Person {

    @Override
    public void run() {
        System.out.println("doc run");
    }

    public void eat(){
        System.out.println("doc eat");
    }
}
