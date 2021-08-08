package com.oop.自定义异常;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            test("s");
        } catch (MyException e) {
            System.out.println("M-->"+e);
        } finally {
        }
    }

    public static void test(String a) throws MyException{
        if(a=="s"){
            throw new MyException(a);
        }
    }
}


