package com.Array;

/**
 * 模拟一个系统.加入系统需要输入用户名和密码
 * */
public class ArrayTest03 {
    // 右键文件 -> modify run configurations -> 配置arguments测试
    public static void main(String[] args) {

        if(args.length!=2){
            System.out.println("账号密码不对");
            return;
        }
        if("admin".equals(args[0]) && "123".equals(args[1])){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }


    }

}
