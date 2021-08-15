package com.DecoratorClass.Integer;

public class IntegerTest05 {
    /**
     * 空指针异常
     * 类型转换异常
     * 数组下标越界异常
     * 数字格式化异常
     */
    public static void main(String[] args) {
        // 手动装箱
        Integer x = new Integer(1009);
        // 手动拆箱
        Integer y= x.intValue();

        // 编译可以通过, 运行出现异常NumberFormatException
//        Integer w = new Integer("中午");

        //重点方法
        /**
         * 一种应用场景: 网页文本框输入的100实际上是字符串, 后台数据库中要求存储100数字, 此时java程序需要将"100"转换成100
         */
        int retValue = Integer.parseInt("123");
        int retValue1 = Integer.parseInt("123.22");//运行出现异常NumberFormatException
//        int retValue2 = Integer.parseInt("双方");//运行出现异常NumberFormatException
        double retValue3 = Double.parseDouble("3.14");

        float retValue4 = Float.parseFloat("3.14");

        // valueOf
        Integer i1 = Integer.valueOf(100);//int --> Integer
        Integer i2 = Integer.valueOf("100");//String --> Integer
    }
}
