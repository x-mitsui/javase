package reflect;

import reflect.bean.UserService;

import java.lang.reflect.*;

/**
 * 反编译一个类的Constructor方法
 */
public class ReflectTest11 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class studentClass = Class.forName("reflect.bean.Student");
        printClassWithConstructors("reflect.bean.VIP");
        printClassWithConstructors("java.lang.Thread");
    }
    public static void printClassWithConstructors(String className){
        Class vipClass = null;
        try {
            vipClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder s = new StringBuilder();
        s.append(Modifier.toString(vipClass.getModifiers())+" class " + vipClass.getSimpleName()+ "{\n");
        // 获取所有的Constructors
        Constructor[] constructors = vipClass.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName());
            s.append("(");
            Class[] parameterTypes =  constructor.getParameterTypes();
            for (Class parameterType : parameterTypes){
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            // 删除指定下标位置上的字符
            if(','==(s.charAt(s.length()-1))){
                s.deleteCharAt(s.length()-1);
            }
            s.append("){}");
            s.append(";\n");

        }
        s.append("}\n");
        System.out.println(s);
    }
}
