package com.oop.classDemo01;

public class Person {
    private int _age;
    private float _weight;

    Person(int age, float weight){
        this._age = age;
        this._weight = weight;
    }

    Person() {

    }

    // 输入setter getter快捷方式 ctrl+Enter
    public void set_age(int _age) {
        this._age = _age;
    }

    public void set_weight(float _weight) {
        this._weight = _weight;
    }

    public int get_age() {
        return _age;
    }

    public float get_weight() {
        return _weight;
    }

    public void println(){
        System.out.println("父类方法");
    }

    private void test(){
        //子类可以继承,但无权限访问
        System.out.println("子类可以继承,但无权限访问");
    }
    public void useTest(){//子类可以继承
        this.test();
    }


}
