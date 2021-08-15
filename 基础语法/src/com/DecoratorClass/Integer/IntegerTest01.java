package com.DecoratorClass.Integer;

class IntegerTest01 {
    public static void main(String[] args) {
        //doSome无法接收基本数据类型,但是又想传入,就需要包装类
        doSome(new MyInt(199));
        // 8种数据类型对应的包装类SUN公司已经写好了
        doSome(new Integer(100));
    }
    public static void doSome(Object obj){
        System.out.println(obj);
    }
}

