package com.Exception;

/*
 final finally finalize有什么区别
 final 关键字
    final修饰的类无法继承
    final修饰的方法无法继承
    final修饰的变量不能重新赋值
 finally  关键字
    和try联合使用
    fianally里方法一定执行
 finalize 标识符
    Object类中的方法名
    由垃圾回收器GC调用
 */
public class ExceptionTest14 {

    public static void main(String[] args) {
        int result = m();
        System.out.println(result);

    }

    /**
     * java语法规则1:
     *  方法体中的代码必须遵守自上而下顺序依次逐行执行
     *  return语句一旦执行,整个方法必须结束
     */
    public static int m(){
        int i = 100;
        try{
            return i;
        } finally {
            i++;
        }
    }

    /**
     * 上述代码反编译,而且满足上一个文件return最后执行的说法
     * int i = 100;
     * int j = i;
     * i++;
     * return j;
     */
}
