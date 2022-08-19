package reflect;

import annotation.AutoRunMethod;

import java.lang.reflect.Method;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/19 10:52
 */

public class ReflectDemo8 {
    public static void main(String[] args) throws Exception {
        String[] str = {"Test2", "Person", "Student", "Test"};
        for (String s : str) {
            Class<?> cls = Class.forName("reflect." + s);
            System.out.println("正在实例化:" + cls.getName());
            Object obj = cls.newInstance();
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(AutoRunMethod.class)) {
                    AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                    int value = arm.value();
                    System.out.println(value);
                    method.invoke(obj);
                }
            }
        }


    }
}
