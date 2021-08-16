package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 异常对象有两个非常重要的方法:
     String msg = exception.getMessage();
     exception.printStackTrace();
 */
public class ExceptionTest09 {

    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            // 打印简单描述
//            String msg = e.getMessage();
//            System.out.println(msg);
            // 在实际开发中, 建议使用这个
            e.printStackTrace();
            /*
            *   java.io.FileNotFoundException: D:/s.r (No such file or directory)
                at java.io.FileInputStream.open0(Native Method)
                at java.io.FileInputStream.open(FileInputStream.java:195)
                at java.io.FileInputStream.<init>(FileInputStream.java:138)
                at java.io.FileInputStream.<init>(FileInputStream.java:93)--以上Sun公司代码
                at com.Exception.ExceptionTest09.m3(ExceptionTest09.java:31) <-查看打印信息切入口
                at com.Exception.ExceptionTest09.m2(ExceptionTest09.java:27)
                at com.Exception.ExceptionTest09.m1(ExceptionTest09.java:23)
                at com.Exception.ExceptionTest09.main(ExceptionTest09.java:15)



            * */
        }
        System.out.println("此处代码仍然执行,很健壮,不会因为异常而宕机");

    }
    public static void m1() throws FileNotFoundException {
        m2();

    }
    public static void m2() throws FileNotFoundException {
        m3();

    }
    public static void m3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D://s.r");

    }
}
