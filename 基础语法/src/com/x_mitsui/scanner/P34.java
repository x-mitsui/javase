package com.x_mitsui.scanner;

import java.util.Scanner;

// nextLine
// 以Enter为结束符.也就是说nextLine会返回的是输入回车之前的所有字符
// 可以获得空白
public class P34 {
    public static void main(String[] args) {
        // 创建扫描器对象,用于接收用户输入
        Scanner scanner= new Scanner(System.in);
        if(scanner.hasNextFloat()){
            // 使用next接收用户输入
            float f = scanner.nextFloat();// 程序等待用户输入
            System.out.println("用户输入:"+f);
        }else {
            System.out.println("输入的不是整数:");
        }

        scanner.close();
    }
}
