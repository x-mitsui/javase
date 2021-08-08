package com.x_mitsui.scanner;

import java.util.Scanner;

// 一定要读取到有效字符后才可以结束
// 对输入有效字符之前遇到的空白,next()方法会将他去掉
// 只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符
// next()不能得到带有字符
public class P33 {
    public static void main(String[] args) {
        // 创建扫描器对象,用于接收用户输入
        Scanner scanner= new Scanner(System.in);
        if(scanner.hasNext()){
            // 使用next接收用户输入
            String str = scanner.next();// 程序等待用户输入
            System.out.println("用户输入:"+str);
        }
        // IO类用完关掉,节省内存资源
        scanner.close();
    }
}
