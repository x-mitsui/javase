package com.Array;

import java.util.Arrays;

/**
 * 编写程序,使用一维数组,模拟栈数据结构
 * 1. 这个栈可以存储java中任何引用类型的数据.
 * 2. 在栈中提供push方法模拟压栈.(栈满了,要有提示信息)
 * 3. 在栈中提供pop方法模拟弹栈.(栈空了,也要有提示信息)
 * 4. 编写测试信息,new栈对象,调用push pop方法来模拟压栈弹栈的动作.
 *
 * 做的时候发现的问题:
 *  注意初始栈长度和栈帧位置
 */
public class ArrayTest07 {
    private Object[] _stack;
    private int _max_size;
    private int _index = -1;// 栈帧, 永远指向栈顶部元素;最初的栈是空的,一个元素都没有
    ArrayTest07(){
        this(0,new Object[]{});
    }
    ArrayTest07(int max_size, Object[] objs){
        this._max_size = max_size;
        if(objs.length>max_size){
            System.out.println("初始化数组长度有误, 请重新赋值");
            return;
        }
        this._index = objs.length;
        this._stack = new Object[this._max_size];
        for (int i = 0; i < this._index; i++) {
            this._stack[i] = objs[i];
        }
    }
    public void push( Object obj){
        int len = this._index;
        if(len==this._max_size){
            System.out.println("栈已满,无法压入!");
            return;
        }
        this._stack[len] = obj;
        this._index++;

    }
    public Object pop(){
        int len = this._index;
        if(0 > len){
            System.out.println("栈已空,无法继续弹出!");
            return null;
        }
        Object temp = this._stack[len-1];
        this._stack[len-1] = null;
        this._index--;
        return temp;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < this._index; i++) {
            temp += ","+this._stack[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        ArrayTest07 at = new ArrayTest07(10,new Object[]{"123","jjjj","lll"});
        at.push("zzz");

        System.out.println(at);
        at.pop();
        System.out.println(at);
    }
}
