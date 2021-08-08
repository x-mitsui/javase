package com.oop.P64;

public class Person {
    String _name;// 默认为null
    /*
    * 构造函数特点:
    * 1. 无返回值,
    * 2. 名字和类名相同
    * */

    // 显示无参数构造器写法
    public Person(){
        this._name = "x_mitsui";
    }

    //有参构造,一旦定义了有参构造,一定要显示定义无参构造(可以定义一个空的无参构造)
    public Person(String name){
        this._name = name;
    }
}
