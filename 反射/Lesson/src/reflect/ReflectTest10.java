package reflect;

import reflect.bean.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 重点: 通过反射机制访问一个java对象的方法
 *
 *  反射机制让代码更具有通用性, 可变化的内容都写到配置文件当中, 将来修改配置文件之后, 创建的对象就不一样了, 调用的方法也不同了,
 *  但是java代码不需要做任何改动. 这就是反射机制的魅力
 *
 *  注意: 可变长参数, 也可以传入数组
 */
public class ReflectTest10 {
    public static void main(String[] args)  {
        // 不使用反射机制怎么访问一个java对象的方法
        /**
         * 给属性赋值三要素:
         *  要素1: 对象UserService
         *  要素2: logoin方法名
         *  要素3: 实参列表
         *  要输4: 返回值
         */
        UserService userService = new UserService();
        boolean loginSuccess = userService.login("admin", "123");
        System.out.println(loginSuccess?"登录成功":"登录失败");


        // 这些参数可以放在可配置文件里
        invokeMethod("reflect.bean.UserService","login", "admin", "123");
        // 可变长参数, 也可以传入数组
        invokeMethod("reflect.bean.UserService","login", new String[]{"admin", "123"});

    }
    public static void invokeMethod(String className, String methodName, String... parameters){
        // 通过反射机制访问一个java对象的方法
        Class studentClass = null;
        Object obj = null;
        Method loginMethod = null;
        try {
            studentClass = Class.forName(className);
            obj = studentClass.newInstance();
            loginMethod = studentClass.getDeclaredMethod(methodName,String.class,String.class);// 获取函数名和参数类型获取
            //  method = studentClass.getDeclaredMethod(methodName,int.class);// 获取函数名和参数类型获取
            // 调用方法:
            /**
             * 虽然使用了反射机制, 调用方法的四要素还是缺一不可:
             *  要素1: loginMethod--方法
             *  要素2: obj--对象
             *  要素3: "admin" "123"--实参
             *  要素4: retValue--返回值
             *  反射机制让代码复杂了, 但是为了一个"灵活", 也是值得的
             */
            Object retValue = loginMethod.invoke(obj,parameters);
            System.out.println(retValue);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
