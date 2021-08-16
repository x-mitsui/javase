package com.Exception;

/*
* 方法覆盖的时候,
*  重写之后的方法不能比重写之前的方法抛出更多(更宽泛)的异常(仅仅指编译型异常),可以抛出任何运行时异常
*  当然一般子类照抄父类方法, 不考虑异常处理
* */
public class ExceptionTest16 {
    public static void main(String[] args) {

    }
}

class Animal{
    public void doSome() {

    }
    public void doOther() throws Exception{

    }
}

class Cat extends Animal{
    /* 编译报错
    public void doSome() throws Exception{

    }
     */
    public void doSome() throws NullPointerException{// 可以抛出任何运行时异常

    }
    // 编译通过
    /*public void doOther() {

    }*/

    // 编译通过
    /*public void doOther() throws Exception{

    }*/

    // 抛出范围更小的, 编译通过
    public void doOther() throws NullPointerException{

    }
}
