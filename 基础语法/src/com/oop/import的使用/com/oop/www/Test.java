package com.oop.import的使用.com.oop.www;
import com.oop.import的使用.wrapper.Other;

import java.util.Scanner;

/*
* import什么时候使用?
* 1. A类中使用B
* 2. A和B类都在同一个包下, 不需要import
* 3. A和B类不在同一个包下, 需要使用import
* 4. 必须放在package和正文之间
* 5. 也可以采用*的方式 import com.oop.import的使用.wrapper.*;编译器自动识别转换不会影响效率,*号是类名那一级
* 6. java.lang下的类不需要import
*
* */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        Other o = new Other();
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str);
    }
}
