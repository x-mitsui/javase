package com.Random;

import java.util.Random;

/**
 * 随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // 随机产生一个int类型取值范围内的数字
            int num1 = random.nextInt();
            System.out.println(num1);
        }

        // 产生[0-101)之间的随机数, 不能产生101.
        // nextInt翻译为: 下一个int类型的数据101. 表示只能取到100
        int num2 = random.nextInt(101);// 不包括101
        System.out.println(num2);

    }
}
