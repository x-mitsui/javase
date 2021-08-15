package com.DecoratorClass.Integer;

// 自定义的包装类
public class MyInt {
    int _value;
    public MyInt() {
    }

    public MyInt(int _value) {
        this._value = _value;
    }

    @Override
    public String toString() {
        return String.valueOf(_value);//妙啊
    }
}
