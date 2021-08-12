package com.oop.接口例子;

public class KentuckyMenu implements Menu{
    @Override
    public void cookHamburg() {
        System.out.println("肯德基汉堡包");
    }

    @Override
    public void cookFriedChicken() {
        System.out.println("肯德基炸鸡");
    }
}
