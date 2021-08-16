package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 深入try...catch
 1. catch()方法参数可以使具体的类型, 也可以该异常类型的父类型
 2. catch()可以写多个,建议catch的时候, 精确的一个个处理,有利于程序调试
 3. catch多个的时候, 从上到下, 必须遵守从上到下.
 */
public class ExceptionTest07 {
    /*
        public static void main(String[] args) throws Exception, FileNotFoundException, IOException {

        }
    */
    public static void main(String[] args) {

        // 编译报错, 未处理方法抛出的异常
//        try {
//            FileInputStream fne = new FileInputStream("D:\\file\\x.txt");
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileInputStream fne = new FileInputStream("D:\\file\\x.txt");
//            System.out.println("以上出现异常, 此处无法执行");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileInputStream fne = new FileInputStream("D:\\file\\x.txt");
//            System.out.println("以上出现异常, 此处无法执行");
//        } catch (IOException e) {//多态:IOException e = new FileNotFoundException(;
//            e.printStackTrace();
//        }

//        try {
//            FileInputStream fne = new FileInputStream("D:\\file\\x.txt");
//            System.out.println("以上出现异常, 此处无法执行");
//        } catch (Exception e) {//多态:IOException e = new FileNotFoundException(;
//            e.printStackTrace();
//        }

//        try {
//            FileInputStream fis = new FileInputStream("D:\\file\\x.txt");
//            fis.read();
//        } catch (FileNotFoundException e) {//多态:IOException e = new FileNotFoundException(;
//            e.printStackTrace();
//        } catch (IOException e){
//
//        }
        try {
            FileInputStream fis = new FileInputStream("D:\\file\\x.txt");
            int t = 100 / 0;
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {//JDK8+支持语法
            System.out.println("文件异常?数学异常?空指针异常");
        }

    }
}
