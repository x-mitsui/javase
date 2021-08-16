package com.Exception;

/*
 关于try...catch的finally子句(3):
 */
public class ExceptionTest12 {

    public static void main(String[] args) {
        try {
            System.out.println("try....");
            System.exit(0);//退出JVM之后, finally中代码就不执行了
        } finally {
            System.out.println("finally....");
        }



    }

}
