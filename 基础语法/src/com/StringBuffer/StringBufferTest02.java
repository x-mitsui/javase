package com.StringBuffer;

/**
 * 如果以后需要大量进行字符串的拼接操作, 建议使用JDK自带的
 * java.lang.StringBuffer
 * java.lang.StringBuffer
 * 尽量在stringBuffer的时候尽可能定一个合适的初始化容量
 * 最好减少扩容次数
 */
public class StringBufferTest02 {
    public static void main(String[] args) {
        // 创建一个初始化容量为16个char[]的数组(字符串缓冲区对象)
        StringBuffer stringBuffer = new StringBuffer();
        // 拼接字符串,以后拼接字符串统一调用append()方法
        // append方法底层在进行追加的时候, 如果char[]数组满了,会"自动"扩容
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append(false);
        stringBuffer.append(3.134);
        stringBuffer.append(100L);
        stringBuffer.append(100L);
        System.out.println(stringBuffer);

        // 2.
        StringBuffer stringBuffer1 = new StringBuffer(20);
    }
}
