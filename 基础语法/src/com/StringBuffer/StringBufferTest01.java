package com.StringBuffer;

/**
 * 思考: 在实际开发中, 如果需要进行字符串的频繁拼接, 会有什么问题?
 * 因为java中的字符串是不可变的, 每一次拼接都会产生新字符串
 * String s = "abc";
 * s += "hello";
 * 就两行代码就导致在方法区字符串常量池中创建了三个对象
 *
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        String s ="";
        // 这样做会给java的方法区字符串常量池带来很大的压力
        for (int i = 0; i < 100; i++) {
            s = s + i;
            System.out.println(s);
        }
    }
}
