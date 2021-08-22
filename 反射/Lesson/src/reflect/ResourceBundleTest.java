package reflect;

import java.util.ResourceBundle;

/*
java.util包下提供了一个资源绑定器, 便于获取属性配置文件中的内容
使用以下这种方式的时候, 属性配置文件, 必须放到类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        // 资源绑定器, 只能绑定xxx.properties文件, 并且这个文件必须在类路径下. 文件扩展名也必须是properties
        // 扩展名也不许写
        ResourceBundle rb = ResourceBundle.getBundle("classinfo");
        String className = rb.getString("className");
        System.out.println(className);
    }
}
