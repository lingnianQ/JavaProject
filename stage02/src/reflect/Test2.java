package reflect;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URISyntaxException;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/18 16:55
 */

public class Test2 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {

        File dir = new File(
                Test2.class.getResource(".").toURI()
        );
        System.out.println(dir);

        File[] subs = dir.listFiles(pathname -> pathname.getName().endsWith(".class"));
        for (File sub : subs) {
            String fileName = sub.getName();
            String className = fileName.substring(0, fileName.indexOf("."));
            Class cls = Class.forName(Test2.class.getPackage().getName() + "." + className);

            System.out.println("实例化对象： " + cls.getSimpleName());
            Object obj = cls.newInstance();
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getParameterCount() != 0
                        || method.getModifiers() != Modifier.PUBLIC
                        || !method.getName().contains("s")) {
                    continue;
                }
//            System.out.println(method.getModifiers());
                System.out.println("自动调用： " + method.getName() + "()");
                method.setAccessible(true);
                method.invoke(obj);
            }

        }
    }
}
