package com.x_mitsui.method;
/* 递归
* 比较耗资源, 能不用递归就不用递归, 小计算可以使用
* */
public class P49_VariableParameters {
    public static void main(String[] args) {
        System.out.println(fab(10));
    }
    public static long fab(int a){
        long rlt ;
        if(a>1){
            rlt = a * fab(a-1);
        }else{
            rlt = 1;
        }
        return  rlt;


    }
}
