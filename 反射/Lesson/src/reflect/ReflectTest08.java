package reflect;

import reflect.bean.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 反射UserService的method
 *
 */
public class ReflectTest08 {
    public static void main(String[] args)  {
        // 不使用反射属性怎么获取一个对象的属性
        /**
         * 给属性赋值三要素:
         *  要素1: 对象s
         *  要素2: no属性
         *  要素3: 1111
         */
        Student student = new Student();
        student.no =111;
        System.out.println(student.no);


        // 这些参数可以放在可配置文件里
        updateFieldValue("reflect.bean.UserService","no", 22222);
    }
    public static void updateFieldValue(String className, String fieldName, int upDateNumber){
        // 通过反射机制访问一个java对象的属性
        Class userServiceClass = null;
        Object obj = null;
        Field noField = null;
        try {
            userServiceClass = Class.forName(className);
            // 获取所有method(包括私有的)
            Method[] methods = userServiceClass.getDeclaredMethods();
            System.out.println(methods.length);

            // 遍历method
            for (Method method : methods) {
                // 获取方法名
                System.out.println(method.getName());
                // 获取返回值类型
                Class returnType = method.getReturnType();
                String returnStr = returnType.getSimpleName();
                System.out.println(returnStr);

                // 获取修饰符列表
                System.out.println(Modifier.toString(method.getModifiers()));

                // 获取参数列表
                System.out.println(method.getParameters());

                // 获取参数类型列表
                Class[] parameterTypes = method.getParameterTypes();
                for (Class parameterType: parameterTypes) {
                    System.out.println(parameterType.getSimpleName());
                }

            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
