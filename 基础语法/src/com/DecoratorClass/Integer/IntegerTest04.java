package com.DecoratorClass.Integer;

/**
 * 在java5之后,引入了自动装箱和自动拆箱
 * 自动装箱:基本数据类型自动转化为装饰类
 * 自动拆箱:装饰类自动转换为基本数据类型
 *
 * 有了自动拆箱之后,Number类的方法就用不着了
 * 自动装箱和自动拆箱的好处
 * 方便编程
 */
public class IntegerTest04 {
    public static void main(String[] args) {
        // 自动装箱
        Integer x = 100;
        System.out.println(x);

        // 自动拆箱
        int y = x;
        System.out.println(y);

        Integer z = 1000; // z仍然保存了一个对象的内存地址, 相当于Integer z = new Integer(1000);
        // 分析为什么没报错?
        // 两边要求是基本数据类型的数字, z是包装类, 不属于基本数据类型, 这里会自动拆箱. 将z转化为基本数据类型
        // 自动
        System.out.println(z + 333);
        Integer w = 100;
        Integer u = 100;
        /**
         * Java中为了提高程序的执行效率, 将[-128到127]之间所有的包装对象提前创建好,
         * 放到了一个方法区的"整数型常量池"中, 目的是只要用这个区间的数据不需要再new了, 直接从整数型常量区中取出来
         * Integer类加载的时候会初始化整数型常量池: 256个对象 池就是缓存:优点效率高,缺点耗费内存
         */
        System.out.println(u == w);
        Integer j = 1000;//Integer j = new Integer(1000);
        Integer i = 1000;//Integer i = new Integer(1000);
        /**
         * i和j是引用, 保存的内存地址不同
         */
        System.out.println(i == j);
    }
}
