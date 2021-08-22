package reflect;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IOPropertiesTest {
    public static void main(String[] args) throws IOException {

        // String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        // FileReader reader = new FileReader(path);// new一个流

        // 直接以流的方式返回
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        String className = pro.getProperty("className2");
        System.out.println(className);
    }
}
