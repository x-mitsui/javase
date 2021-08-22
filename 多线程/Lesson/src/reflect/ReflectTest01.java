package reflect;

import java.util.Date;

/**
 * 要操作一个类的字节码, 首先要获取这个类的字节码,怎么获取java.lang.Class:
 *  三种方式:
 *      第一种方式: Class c = Class.forName("带包名的完整类名")
 *      第二种方式: Class c = 对象.getClass();
 *      第三种方式: Class c = 任何类型.class;
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
            Class.forName()参数必须是一个完整类名,必须包含包名.不能省略
         */
        Class c1=null;
        Class c2=null;
        try {
            c1 = Class.forName("java.lang.String");// c1代表String.class文件, 或者说c1代表String类型 ,将类加载到方法区
            c2 = Class.forName("java.util.Date");// c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");//c3代表代表Integer类型
            Class c4 = Class.forName("java.lang.System");//c4代表代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // java中任何一个对象都有一个方法: getClass()
        String s = "abc";
        Class x = s.getClass();// x代表String.class字节码文件, x代表String类型
        System.out.println(c1 == x);//true

        Date d = new Date();
        Class y = d.getClass();
        System.out.println(c2 == y);//true,y和c2都指向方法区的字节码文件

        // java语言中任何一种类型, 包括基本数据类型, 它都有.class属性
        Class z = String.class;
        Class k = Date.class;
        Class f = int.class;
        Class g = double.class;
    }
}
