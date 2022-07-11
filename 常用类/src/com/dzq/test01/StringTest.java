package com.dzq.test01;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/10 - 07 - 10 - 09:16
 * @Description: com.dzq.test01
 * @version: 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String S = "abc";
        System.out.println(S);

        char[] C = {'a','b','c'};
        String S2 = new String(C);
        System.out.println(S2);

        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb2 = sb.append("def");
        System.out.println(sb==sb2);


    }
}
