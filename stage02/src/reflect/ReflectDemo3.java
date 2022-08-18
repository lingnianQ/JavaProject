package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * 使用反射机制实例化对象
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person();
        System.out.println(p);

        Class cls = Class.forName("reflect.Person");

        Constructor c = cls.getConstructor(String.class, int.class);

        Object obj = c.newInstance("qwe", 12);//利用公开的无参的构造器实例化对象new Person()
        System.out.println(obj);

    }
}
