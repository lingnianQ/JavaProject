package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/18 14:45
 */

public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person();
        p.sayHello();

        //实例化
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method method = cls.getMethod("sayHello");

        method.invoke(obj);
    }
}
