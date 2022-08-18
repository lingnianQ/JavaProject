package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/18 16:15
 */

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getParameterCount() != 0
                    || method.getModifiers() != Modifier.PUBLIC) {
                continue;
            }
//            System.out.println(method.getModifiers());
            System.out.println("自动调用： " + method.getName() + "()");
            method.setAccessible(true);
            method.invoke(obj);
        }


    }
}
