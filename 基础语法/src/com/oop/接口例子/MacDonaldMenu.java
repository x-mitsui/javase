package com.oop.接口例子;

public class MacDonaldMenu implements Menu{
    @Override
    public void cookHamburg() {
        System.out.println("麦当劳汉堡包");
    }

    @Override
    public void cookFriedChicken() {
        System.out.println("麦当劳炸鸡");
    }
}
