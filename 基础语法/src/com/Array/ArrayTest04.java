package com.Array;

public class ArrayTest04 {
    // 数组中存储的每个元素是'引用'
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Cat();
        Animal[] animals = {a1, a2};

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
            if (animals[i] instanceof Cat){
                ((Cat) animals[i]).catchMouse();// 向下转型
            }
        }


    }

}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("Cat move...");
    }
    public void catchMouse(){
        System.out.println("catch mouse");
    }
}
