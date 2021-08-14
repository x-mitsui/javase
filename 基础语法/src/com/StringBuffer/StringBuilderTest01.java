package com.StringBuffer;

/**

 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        // 使用StringBuilder也是可以完成字符串拼接
        // StringBuffer中的方法都有synchronized关键字修饰,多线程环境下运行是安全的
        // StringBuilder多线程环境下运行是不安全的
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(100);
        stringBuilder.append(true);
        stringBuilder.append("bus");
        System.out.println(stringBuilder);
    }
}
