package reflect;

import annotation.AutoRunClass;
import annotation.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/19 10:12
 */

public class Test4 {
    public static void main(String[] args) throws Exception {
        File dir = new File(Test4.class.getResource(".").toURI());
        System.out.println(dir);

        File[] subs = dir.listFiles(pathname -> pathname.getName().endsWith(".class"));

        for (File sub : subs) {

            String className = sub.getName().substring(0, sub.getName().indexOf("."));
            Class<?> cls = Class.forName(Test4.class.getPackage().getName() + "." + className);
            System.out.println(Test4.class.getPackage().getName() + "." + className);

//            if (cls.isAnnotationPresent(AutoRunClass.class)) {
                System.out.println("正在实例化:" + cls.getName());
                Object obj = cls.newInstance();
                System.out.println(obj);

                //获取所有方法
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(AutoRunMethod.class)) {
                        System.out.println("自动调用:" + method.getName() + "()");
                        method.invoke(obj);
                    }
//                }


            }

        }

    }
}
