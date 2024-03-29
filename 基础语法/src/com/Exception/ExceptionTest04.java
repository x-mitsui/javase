package com.Exception;


public class ExceptionTest04 {
    public static void main(String[] args) {
        // main方法中调用doSome()方法
        // 因为doSome()方法声明位置上有:ClassNotFoundException
        // 我们在调用doSome()方法的时候必须对这种异常进行预先的处理.
        // 如果不处理, 编译器就报错.
//        doSome();
    }

    /**
     * 这个代码表示doSome()方法在执行过程中, 有可能出现ClassNotFoundException异常.
     * 叫做类没找到异常. 这个异常直接父类是:Exception,所以ClassNotFoundException是编译型异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}
