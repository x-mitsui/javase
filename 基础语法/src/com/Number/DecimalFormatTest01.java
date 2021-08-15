package com.Number;

import java.text.DecimalFormat;

/**
 * 数字格式化
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        // java.text.DecimalFormat专门负责数字格式化
        // DecimalFormat df = new DecimalFormat("数字格式");
        /*
        * 数字的格式有哪些
        * # 代表任意数字
        * , 代表千分位
        * . 代表小数点
        * 0 代表不够时,补0
        * */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String str = df.format(30030.23498);
        System.out.println(str);

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String str2 = df2.format(30030.2);
        System.out.println(str2);

        //java.lang.IllegalArgumentException: Unexpected '0' in pattern "00#,###.0000"
//        DecimalFormat df3 = new DecimalFormat("00#,###.0000");
//        String str3 = df3.format(30.2);
//        System.out.println(str3);

    }
}
