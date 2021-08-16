package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 关于try...catch的finally子句(2):
 */
public class ExceptionTest11 {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        /* 以下代码,先执行try,再执行finally
         * 最后执行return
         */
        try {
            // try和finally, 没有catch可以吗? 可以
            // try不能单独使用
            // try finally 可以联合使用
            System.out.println("try....");
            return;// 即使有return,finally也会执行
        } finally {
            // 没有catch也能执行finally
            System.out.println("finally....");
        }

//        System.out.println("code....");//此处代码执行不到, 和return有关, 所以不能写语句


    }

}
