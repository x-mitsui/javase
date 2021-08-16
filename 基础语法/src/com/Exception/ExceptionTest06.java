package com.Exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
    /**
    * 处理异常的第一种方式:在方法声明的位置上使用throws关键字抛出, 谁调用我这个方法, 我就抛给谁, 抛给调用者来处理.
     * 处理异常的第二种方式:使用try...catch语句对异常进行捕捉
     * 这个异常不会上报, 自己把这个事儿处理了
     * 异常抛出倒刺为止,不在上抛.
    */

    /** 异常上报和捕捉的联合使用
     * 一般不建议在main方法上使用throws, 因为这个异常如果真的发生了, 一定会抛给JVM, JVM只有终止.
     * 异常处理机制的作用就是增强程序的健壮性. 怎么能做到, 异常发生了也不影响程序的进行.
     * 所以一般main方法中的异常建议使用try...catch进行捕捉.main就不要继续上抛了.
     */
    /*
    public static void main(String[] args) throws Exception{
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }
    */
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            System.out.println("Hello World");// 以上代码出异常, 这里就无法执行了,直接进入catch语句
        } catch (IOException e) {
            // 这个分支中可以使用e引用, e引用报错的内存地址时那个new出来的异常对象的地址, 可在FileInputStream构造方法里查看
//            e.printStackTrace();
            System.out.println("文件读取失败, 可能路径错误, 或者文件被删除了!!!");
            System.out.println(e);// 调用toString方法
        }

        //try...catch抓住异常后,这里的代码继续执行
        System.out.println("main over");
    }
    // 抛FileNotFoundException的父类IOException是可以的, 当然Exception也可以;也可以写多个异常
    public static void m1() throws IOException ,ClassCastException{
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");// 以上代码出异常, 这里就无法执行了.
    }

    //抛别的异常不行, 抛ClassCastException说明你还没对FileNotFoundException进行处理
//    public static void m2() throws ClassCastException{
    public static void m2() throws FileNotFoundException{
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");// 以上代码出异常, 这里就无法执行了.
    }

    public static void m3() throws FileNotFoundException {
        System.out.println("m3 begin");
        /**
         * 此处编译器为什么报错?
         * 第一: 这里调用了一个构造方法: FileInputStream(String name)
         * 第二: 这个构造方法的声明位置上有: throws FileNotFoundException
         * 第三: 通过类的继承结构看到: FileNotFoundException父类是IOException, IOException的父类是Exception
         * 最终得知: FileNotFoundException是编译时异常.
         *
         * 所以报错原因: 编译时异常要求程序员编写程序阶段必须对它进行处理, 不处理编译器报错.
         */
        // 我们采用第一种方式, 在方法声明的位置上使用throws继续上抛.
        // 一个方法体当中的代码出现异常之后, 如果上报的话, 此方法结束.
//        new FileInputStream(System.getProperty("user.dir")+"//res//ExceptionTest06.txt");
        new FileInputStream(System.getProperty("user.dir")+"//res//ExceptionTest06.txt11");
        System.out.println("m3 over");// 以上代码出异常, 这里就无法执行了.
    }


}
