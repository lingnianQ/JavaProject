package reflect;

import annotation.AutoRunClass;

import java.io.File;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/19 9:32
 */

public class Test3 {
    public static void main(String[] args) throws Exception {
        File dir = new File(
                Test3.class.getResource(".").toURI()
        );
        System.out.println(dir);

        File[] subs = dir.listFiles(pathname -> pathname.getName().endsWith(".class"));
        for (File sub : subs) {
            String fileName = sub.getName();
            String className = fileName.substring(0, fileName.indexOf("."));
            Class<?> cls = Class.forName(Test3.class.getPackage().getName() + "." + className);

            if (cls.isAnnotationPresent(AutoRunClass.class)) {
                System.out.println("AutoRunClass标注对象： " + cls.getSimpleName() + " 实例化");
                Object obj = cls.newInstance();
                System.out.println(obj);
            }
        }

    }
}
