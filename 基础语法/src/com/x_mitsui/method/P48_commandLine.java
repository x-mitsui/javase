package com.x_mitsui.method;

public class P48_commandLine {

    public static void main(String[] args) {
        for(int i =0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    /* 测试方式
    * 1. javac P48_commandLine.java
    * 2. cd 到src
    * 3. java com.x_mitsui.method.P48_commandLine this is a dog.
    * */

}
