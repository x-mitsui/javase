package reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;

/**
 * 反射Student类中的所有Field
 *
 */
public class ReflectTest05 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class studentClass = Class.forName("reflect.bean.Student");
        System.out.println(studentClass.getName());//完整类名包括报名
        System.out.println(studentClass.getSimpleName());//文件名
        // 获取类中所有public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);
        Field field = fields[0];
        System.out.println(field.getName());

        // 获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);
        for (Field f : fs) {
            System.out.println("----------");
            Class fieldType = f.getType();
            String typeName = fieldType.getName();
            System.out.println("typeName:"+typeName);
            System.out.println("TypeSimpleName:"+fieldType.getSimpleName());
            System.out.println(f.getName());

            int i = f.getModifiers();//加"s"是因为一个字段可能有多个修饰符
            System.out.println(i);
            String Mname = Modifier.toString(i);
            System.out.println("修饰符--->"+Mname);
        }
    }
}
