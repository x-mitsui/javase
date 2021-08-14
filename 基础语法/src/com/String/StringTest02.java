package com.String;

public class StringTest02 {
    public static void main(String[] args) {
        String s01 = "hello";
        String s02 = "hello";
        System.out.println(s01==s02);//?
        /**
         * "hello"是存储在方法区的字符串常量池当中
         * 所以这个"hello"不会新建.(因为这个对象已经存在了)
         * == 比较的是变量保存的内存地址,so
         */

        String s03 = new String("hello");
        String s04 = new String("hello");
        System.out.println(s03==s04);//?

        //所以字符串比较不用 ==
        //String的equals已经重写
        System.out.println(s03.equals(s04));
        System.out.println("testStr9jg".equals(s04));//编译通过的原因:"testStr9jg"也是对象
        System.out.println(s04.equals("testStr9jg"));//此写法有空指针异常的风险,建议用上面一种写法
    }
}
