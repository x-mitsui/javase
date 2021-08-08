package com.x_mitsui.method;

public class P47_overloading {

    public static void main(String[] args) {
        int sum1 = add(3, 4);
        int sum2 = add(3, 4, 5);
        double sum3 = add(3.5, 4);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    /* 方法重载
       方法名必须相同
       参数列表必须不同(个数不同或类型不同或参数排列顺序不同等)
       返回类型可相同,也可以不同
       仅仅返回类型不同不足以成为方法的重载
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
