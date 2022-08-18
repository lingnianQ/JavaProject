package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/18 15:20
 */

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();
        //say(String info)
        Method say = cls.getMethod("say", String.class);
        say.invoke(obj, "你好");

        //say(String info,int count)
        Method say1 = cls.getMethod("say", String.class, int.class);
        say1.invoke(obj, "呵呵", 5);
    }
}
