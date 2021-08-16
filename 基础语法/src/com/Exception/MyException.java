package com.Exception;

/*
 Sun公司提供的JDK内置的异常肯定是不够用的. 在实际的开发中, 有很多业务,
 这些业务出现异常之后, JDK中都是没有的, 和业务挂钩的.

 2. 如何自定义, 模仿官方异常类写法
  2.1 编写一个类继承Exception或者RuntimeException
  2.2 替换两个构造方法, 一个无参数, 一个带参数
  2.3 异常类型看出现频率,出现概率高就编译型异常
 */
public class MyException extends Exception {

    public static void main(String[] args) {
        MyException e = new MyException("发现异常");
        e.printStackTrace();
    }

    public MyException(){

    }
    public MyException(String s){
        super(s);
    }
}
