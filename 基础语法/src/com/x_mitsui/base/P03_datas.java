package com.x_mitsui.base;

public class P03_datas {
    public static void main(String[] args) {
        /* 基本数据类型8种:
            数值类型:
                整数类型:
                byte 1个字节:-128-127
                short 2个字节:-32768-32767
                int 4个字节
                long 8个字节

                浮点型:
                float 4个字节
                double 8个字节

                字符类型:
                char 2个字节
                boolean类型 1bit: true false

                1字节==8 bit

                顺口溜: byte short int long / float double boolean char
         */
        // 整数
        int I = 23;
        byte B = 23;
        short S = 30;
        long L = 50L;// l和L都行,但是之所以不用l,是因为l容易被误认为1

        // 小数
        float num = 50.3f;//后面加f,以此甄别
        double num2 = 3.1415926537834;

        // 字符
        char name = '好';// 一个字,单引号
//        String MM = "你好";// 可多字,双引号

        // 布尔值
        boolean flag = true;

        /*
        * 引用类型: 除了基本数据类型都是引用类型
        * */
    }
}
