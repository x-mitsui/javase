package com.oop.异常;

public class Application {
    public static void main(String[] args) {
        // 掌握三种异常
        // 1. 检查性异常
        // 2. 运行时异常
        // 3. 错误

        /**
         * 1. 处理运行时异常时, 采用逻辑去合理规避同时辅助 tru-catch处理
         * 2. 多重catch块后面,可以加一个catch(Exception)来处理可能被遗漏的异常
         * 3. 对于不确定的代码,也可以加上try-catch,处理潜在的异常.
         * 4. 尽量去处理异常,切记只是简单地调用printStackTrace()去打印输出
         * 5. 具体如果处理异常, 根据业务决定
         * 6. 尽量使用finally语句块释放占用资源
         *
         * */
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){//参数:想要捕获的类型
            System.out.println("分母不能为0");
        }finally {//可以不写, 一般处理IO关闭

            System.out.println("finally");
        }
        System.out.println("-------");
        try {
            System.out.println(a/b);
        }catch (Error e){
            System.out.println("Error");
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable e){
            System.out.println("Throwable");
        }finally {

            System.out.println("finally");
        }

        // 快捷输入 先输入try内部代码块,再执行alt + command + t

        try {
            // code
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        try {
            throwTest(0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
        }

    }
    //假设这个方法处理不了异常,可以让方法抛出异常用throws
    public static void throwTest(int a) throws ArithmeticException{
        System.out.println();
        if (a==0){
            // 主动抛出异常, 一般在函数中使用
            throw new ArithmeticException();
        }
    }


}
