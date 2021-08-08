package com.x_mitsui.base;

public class P06_variable {
    // 常量 修饰符不分前后 ,final常量,和其它语言const 类似,变量名大写和下划线
    static final float HEIGHT = 1.88f;
    final static String SEX = "male";
    // 类变量 static
    static double salary = 2500;
    // 实例变量: 从属于对象: 如果不自行初始化, 默认值为0, 0.0
    // 布尔值默认值为false
    // 除了基本数据类型, 其余的都是null
    String name;
    int age;
    float weight;
    public static void main(String[] args) {
        // 局部变量:必须声明和初始化
        int a =3, b =3, c=4;
        char x = 'x';
        long k = 122323232323L;

        // 实例变量
        P06_variable p06 = new P06_variable();
        System.out.println(p06.name);
        System.out.println(p06.age);
        System.out.println(p06.weight);

        // 类变量 static
        System.out.println(salary);
    }
}
