package com.Exception;

/*
 finally面试题
 */
public class ExceptionTest13 {

    public static void main(String[] args) {
        int result = m();
        System.out.println(result);

    }

    /**
     * java语法规则1:
     *  方法体中的代码必须遵守自上而下顺序依次逐行执行
     *  return语句一旦执行,整个方法必须结束
     */
    public static int m(){
        int i = 100;
        try{
            return i;
        } finally {
            i++;
        }
    }

    /**
     * 上述代码反编译,而且满足上一个文件return最后执行的说法
     * int i = 100;
     * int j = i;
     * i++;
     * return j;
     */
}
