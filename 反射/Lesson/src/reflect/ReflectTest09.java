package reflect;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 反编译一个类method
 *
 */
public class ReflectTest09 {
    public static void main(String[] args)  {

        // 这些参数可以放在可配置文件里
        printClassWithMethods("reflect.bean.UserService");
    }
    public static void printClassWithMethods(String className){
        StringBuilder sb = new StringBuilder();

        // 通过反射机制访问一个java对象的属性
        Class userServiceClass = null;
        Object obj = null;
        Field noField = null;
        try {
            userServiceClass = Class.forName(className);
            sb.append(Modifier.toString(userServiceClass.getModifiers())+" class "+userServiceClass.getSimpleName()+"{\n");
            Method[] methods = userServiceClass.getDeclaredMethods();
            for (Method method : methods) {
                sb.append("\t");
                sb.append(Modifier.toString(method.getModifiers()));
                sb.append(" ");
                sb.append(method.getReturnType().getSimpleName());
                sb.append(" ");
                sb.append(method.getName());
                sb.append("(");
                Class[] parameterTypes = method.getParameterTypes();
                for (Class parameterType: parameterTypes) {
                    sb.append(parameterType.getSimpleName());
                    sb.append(",");
                }
                // 删除指定下标位置上的字符
                if(','==(sb.charAt(sb.length()-1))){
                    sb.deleteCharAt(sb.length()-1);
                }

                sb.append("){}\n");
            }
            sb.append("}\n");
            System.out.println(sb);




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
