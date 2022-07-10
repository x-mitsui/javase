package com.dzq.reload;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/8 - 07 - 08 - 09:27
 * @Description: com.dzq.reload
 * @version: 1.0
 */
public class Person {
    private int mum;
    public void say(){
        System.out.println("hello");
    }

    public Person(int mum) {
        this.mum = mum;
    }

    public boolean equals(Object b){
        System.out.println(b.getClass().getName());

        if(b instanceof Person){
            return ((Person)b).mum == this.mum;
        }
        return false;
    }

    public static void show(){
        System.out.println("12121");
    }
}
