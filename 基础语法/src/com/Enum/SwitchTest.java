package com.Enum;

public class SwitchTest {
    /**
     * switch语句支持枚举,也支持String, int
     * byte long short也可以,因为存在自动类型转换
     * @param args
     */
    public static void main(String[] args) {
        Season s = Season.AUTUMN;
        switch (s){
            case SPRING:
                System.out.println("春");
                break;
            case SUMMER:
                System.out.println("夏");
                break;
            case AUTUMN:
                System.out.println("秋");
                break;
            case WINTER:
                System.out.println("冬");
                break;
        }
    }
}
