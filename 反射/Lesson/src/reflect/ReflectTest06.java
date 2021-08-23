package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 通过反射机制, 反编译一个类的属性
 *
 */
public class ReflectTest06 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class studentClass = Class.forName("reflect.bean.Student");
        printClassWithFields("reflect.bean.Student");
        printClassWithFields("java.lang.Thread");
    }
    public static void printClassWithFields(String className){
        Class studentClass = null;
        try {
            studentClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder s = new StringBuilder();
        s.append(Modifier.toString(studentClass.getModifiers())+" class " + studentClass.getSimpleName()+ "{\n");
        // 获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();

        for (Field field : fs) {
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append(";\n");

        }
        s.append("}");
        System.out.println(s);
    }
}
