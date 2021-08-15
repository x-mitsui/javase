package com.Exception;


public class ExceptionTest05 {
    /*
    // 接上一个例子
    // 第一种方式: 在方法声明的位置上继续使用: throws, 来完成异常的继续上抛. 抛给调用者
    // 上抛类似于推卸责任.(继续把异常传给调用者)
    public static void main(String[] args) throws ClassNotFoundException{
        doSome();
    }
    */
    // 第二种方式, 利用try...catch'.
    // 捕捉等于把异常拦下了, 异常真正的解决了
    public static void main(String[] args) throws ClassNotFoundException{
        try {
            doSome();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }

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
