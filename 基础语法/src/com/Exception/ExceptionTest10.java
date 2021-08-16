package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 关于try...catch的finally子句:
    1. 在finally字句中代码最后执行, 并且一定执行, 即使try语句块中的代码出现了异常.
    2. finally语句通常使用在哪些情况?
    通常在finally语句块中完成资源的释放/关闭, 因为finally比较有保障
 */
public class ExceptionTest10 {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            // 创建输入流对象
            fileInputStream = new FileInputStream("D://s.r");
            String s = null;
            s.toString();
            System.out.println("上面异常,我和我之下的不执行");


            // 流使用完需要关闭,因为会占用内存
            // 即使以上程序出现异常,流也必须要关闭
            // 放在这里有可能流关不了
            // fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }  finally {
            //流关闭放这比较保险
            //finally代码一定会执行
            //即使try中出现了异常
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("~~~~~~~~~~~~");

    }

}
