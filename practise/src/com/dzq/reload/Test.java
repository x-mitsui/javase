package com.dzq.reload;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/8 - 07 - 08 - 09:40
 * @Description: com.dzq.reload
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person(11);
        p.say();
        Person p2=new Person(11);
        p.equals(p2);

        Student s = new Student(1);
        Student.show();

        Student.D d =  s.new D();

        try {
            int s2=1/(100-100);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("jijiji");
        System.out.println(3);
    }
}
