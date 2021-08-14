package com.String;

public class StringTest05 {
    public static void main(String[] args) {
        // String类中常用方法
        // 1. char charAt(int index)
        char c = "中国人".charAt(1);//"中国人"是对象,所以能用"."运算符
        System.out.println(c);
        // 2. compareTo
        System.out.println("abc".compareTo("abc"));//0
        System.out.println("abcd".compareTo("abce"));//-1
        System.out.println("abce".compareTo("abcd"));//1
        System.out.println("abc".compareTo("cab"));//-2
        // 3.判断前面字符串是否包含后面的子字符串
        System.out.println("Hello.java".contains(".java"));
        System.out.println("http://www.baidu.com".contains("https"));
        // 4.判断字符串是否以某个字符串结尾
        System.out.println("text.txt".endsWith(".java"));
        System.out.println("text.txt".endsWith(".txt"));
        // 5.比较字符串是否相等必须使用equals
        System.out.println("123".equals("123"));
        // 6.
        System.out.println("123".equalsIgnoreCase("123"));
        // 7.getBytes
        byte[] bytes = "abced".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        // 8.判断某子字符串在当前字符串中第一次出现处的索引
        System.out.println("whosyourdadiin".indexOf("sy"));
        // 9.判断某字符串是否为空,isEmpty判断length()是否为0
        System.out.println("".isEmpty());
        // 10.获取数组长度是length属性
        System.out.println("abc".length());
        // 11.判断某子字符串在当前字符串中最后一次出现处的索引
        System.out.println("whosyourdadiin".lastIndexOf("sy"));
        // 12.replace
        String newString = "http://www.baidu.com".replace("http","https");
        System.out.println(newString);
        // 13.拆分字符串
        String[] ymd = "1980-10-11".split("-");
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }
        String param = "name=zhangsan&password=123&age=20";
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            //还可以继续通过"="拆分
        }
        // 14.判断字符串是否以某个字符串开始
        System.out.println("http://www.baidu.com".startsWith("https"));
        // 15.substring
        System.out.println("http://www.baidu.com".substring(7));//参数为起始下标
        // 16
        System.out.println("http://www.baidu.com".substring(11,16));//参数为起始下标,结束下标
        // 17.
        char[] chars = "Are you Ok".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        // 18. toLowerCase
        // 19. toUpperCase
        // 20. trim: 去除字符串前后空白
        System.out.println("   wang k .  ".trim());
        // 21. String唯一静态方法valueOf: 将非字符串转换为字符串
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(100));
        System.out.println(String.valueOf(new Customer()));

    }
}
class Customer{
    @Override
    public String toString() {
        return "调用了我";
    }
}
