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

        getMethod("reflect.bean.UserService");
    }
    public static void getMethod(String className){
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
