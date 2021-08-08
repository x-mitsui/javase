package com.x_mitsui.base;

public class P04_datas_extension {
    public static void main(String[] args) {
        /* 银行的数据怎么表示
         * 避免使用浮点数进行比较
         * BigDecimal  数据工具类
         */
        // 整数
        double B = 1/10;
        float A = 0.1f;
        System.out.println(A==B);// false

        float d1 = 222222222222f;
        float d2 = d1++;
        System.out.println(d1==d2);

        /*
        * 字符类拓展
        * */
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);
        // 所有的字符本质是数字
        // 编码 Unicode 2字节 0 - 65536 (97=a ,65=A)
        char c3 = '\u0061';//6*16+1=97
        System.out.println(c3);
        System.out.println("Hello\nWorld");//转义字符

        /*
         * 布尔类拓展
         * */
        boolean R = (5-3==2);
        if(R){
            System.out.println("真");
        }
    }
}
