package com.进阶.Object类的方法;

import com.oop.抽象类.A;

import java.util.Objects;

/*
* 判断两个对象是否相等不能用'==', '=='比较的是内存地址.
* 而Object内的equals依然只是使用'==',所以需要我们重写
* */
public class L02_equals {
    Address address;
    String name;

    public L02_equals() {
    }

    public L02_equals(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof L02_equals)) return false;
        L02_equals that = (L02_equals) o;
        return that.address.equals(address) && that.name.equals(name);
    }

    public static void main(String[] args) {
        L02_equals l02 = new L02_equals(new Address("河北","唐山"),"张三");
        L02_equals l03 = new L02_equals(new Address("河北","唐山"),"张三");
        L02_equals l04 = new L02_equals(new Address("山东","济南"),"李四");
        System.out.println(l02.equals(l03));
        System.out.println(l03.equals(l04));
    }

}

class Address{
    String province;
    String city;

    public Address() {
    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }


    public boolean equals(Object o){
        if(this ==o)return true;
        if(!(o instanceof Address)||o==null)return false;
        Address addr = (Address) o;
        return this.province.equals(addr.province)&&this.city.equals(addr.city);
    }
}


