package com.Exception;

public class ExceptionTest15 {
    private Object[] _stack;
    private int _max_size;
    private int _index = -1;// 栈帧, 永远指向栈顶部元素;最初的栈是空的,一个元素都没有
    ExceptionTest15(){
        this(0,new Object[]{});
    }
    ExceptionTest15(int max_size, Object[] objs){
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
    public void push( Object obj) throws MyStackOperationException {
        int len = this._index;
        if(len>=this._max_size){
            // 手动抛出
            throw new MyStackOperationException("栈已满,无法压入!");// 这里自己创建异常自己捕捉没意义, 所以抛出去
        }
        this._stack[len] = obj;
        this._index++;

    }
    public Object pop() throws MyStackOperationException {
        int len = this._index;
        if(0 >= len){
//            System.out.println("栈已空,无法继续弹出!");
            throw new MyStackOperationException("栈已空,无法继续弹出!");
//            return null;
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
        ExceptionTest15 at = new ExceptionTest15(10,new Object[]{"123","jjjj","lll"});
        try {
            at.push("zzz");
            at.push("zzz");
            at.push("zzz");
            at.push("zzz");
            at.push("zzz");
            at.push("zzz");
            at.push("zzz");
            at.push("zzz");
            at.push("zzz");
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
            at.pop();
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
