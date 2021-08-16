package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 异常对象有两个非常重要的方法:
     获取异常的简单描述信息
     String msg = exception.getMessage();
     打印异常追踪的堆栈信息:
     exception.printStackTrace();
 */
public class ExceptionTest08 {

    public static void main(String[] args) {
        // 这里只是new了异常对象, 但是没有将异常对象抛出. JVM会认为这是一个普通的java对象
        NullPointerException e = new NullPointerException("空指针异常balabala");
        // 获取异常的简单描述信息:这个信息实际上就是构造方法上面的String参数
        String msg = e.getMessage();
        System.out.println(msg);

        //打印异常追踪的堆栈信息:
        e.printStackTrace();// 异步线程输出
        System.out.println("hello world");

    }
}
