package com.DecoratorClass.Integer;

/**
 * 1. java为8种数据类型又对应了8种包装类型,8种包装类型属于引用数据类型,父类是Object
 * 2. 为什么要提供包装类
 * 基本数据类型                   包装类型
 * byte                         Byte(父类Number)
 * short                        Short(父类Number)
 * int                          Integer(父类Number)
 * long                         Long(父类Number)
 * float                        Float(父类Number)
 * double                       Double(父类Number)
 * boolean                      Boolean(父类Object)
 * char                         Character(父类Object)
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        //123这个基本数据类型,进行构造方法包装达到了: 基本数据类型转换为引用数据类型(装箱)
        Integer i = new Integer(123);
        Integer i2 = new Integer("123");

        //引用数据类型转换为基本数据类型(拆箱)
        float f = i.floatValue();
        int intValue = i.intValue();
        System.out.println(f);
        System.out.println(intValue);

    }
}
