package com.Number;

import java.math.BigDecimal;

/**
 * BigDecimal 属于大数据, 精度极高. 不属于基本数据类型, 属于java对象(引用数据类型,SUN提供,专用于财务软件中)
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        // 这个100不是普通的100, 是精度极高的100
        BigDecimal v1 = new BigDecimal(100);
        // 精度极高的200
        BigDecimal v2 = new BigDecimal(200);

        // 求和不能用v1+v2, 需要调用方法求和
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);
    }
}

