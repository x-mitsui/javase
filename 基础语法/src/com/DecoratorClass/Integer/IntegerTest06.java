package com.DecoratorClass.Integer;

/**
 * String int Integer互相转换
 */
public class IntegerTest06 {
    public static void main(String[] args) {
        //String->int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1+1);
        //String->Integer
        Integer y = Integer.valueOf("123");
        //int->String
        String s2 = i1+"1";
        System.out.println(s2);
        //int->Integer
        Integer x = 100;
        //Integer->int
        int w = x;
        //Integer->String
        String p = String.valueOf(y);
    }
}
