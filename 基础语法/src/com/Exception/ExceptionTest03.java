package com.Exception;

/**
 Java语言中对异常的处理包括两种方式
 第一种方式: 在方法声明的位置上, 使用throws关键字, 抛给上一级,
    "谁调用我, 我就抛给谁"
 第二种方式: 使用 try...catch 语句进行异常的捕捉
    "这件事发生了, 谁也不知道, 因为我给抓住了"
 举例:
    我是某公司一个销售, 因为我的失误, 导致公司损失了1000元, "损失1000元" 这可以看做是一个异常发生了.
    我有两种处理方式,
        第一种方式: 我把事情告诉我的领导[异常上抛]
        第二种方式: 我自己掏腰包把这个钱补上[异常的捕捉]
 注意:
    1. 异常发生后, 如果我选择上抛, 抛给了我的调用者, 调用者需要对这个异常继续处理, 那么调用者处理这个异常同样也有两种方式.
    2. Java中异常发生之后如果一直上抛, 最终抛给了main方法, main方法继续向上抛, 抛给了调用者JVM, JVM知道这个异常发生,
    只有一个结果: 终止Java程序的执行.
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        /**
         * 程序执行到此处发生了ArithmeticException异常,
         * 底层new了一个ArithmeticException异常对象,
         * 然后抛出了, 由于是main方法调用了100 /0 ,
         * 所以这个异常ArithmeticException抛给了main方法,
         * main方法没有处理, 将这个异常抛给了JVM,
         * JVM最终终止了程序的运行.
         */
        System.out.println(100/0);
        System.out.println("Hello World");
    }
}
