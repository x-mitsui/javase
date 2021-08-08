package com.x_mitsui.operator;

public class P27 {
    public static void main(String[] args) {
        long a = 3L;
        int b = 123;
        short c = 10;
        byte d = 8;
        double k = 3.0;



//        System.out.println((String)a+b+c+d);// 结果为long类型,操作数有long,结果就为long
        System.out.println(b+c+d);// 结果为int类型,无long,无论是否有int结果都为int
        System.out.println(c+d);// 结果为int类型
//        System.out.println((String)c+d+k);//

        /*
            A = 0011 1100
            B = 0000 1101
            ----------------
            A&B = 0000 1100
            A|B = 0011 1101
            A^B = 0011 0001 (异或,相同为0,不同为1)
            ~B = 1111 0010

            例子2*8 = 16 如何计算最快?
            <<  *2
            >>  /2
            2*8 = 2*2*2*2
         */
        System.out.println(2 << 3 );
    }
}
