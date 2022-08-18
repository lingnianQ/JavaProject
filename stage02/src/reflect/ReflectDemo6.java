package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/18 15:42
 */

public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();
      /*  Class的方法:
        Method getMethod()
        Method[] getMethods()
        上述两个方法只能用于获取Class所表示的类的公开方法(包含从超类继承的)

        Method getDeclaredMethod()
        Method[] getDeclaredMethods()
        上述两个方法可以获取Class所表示的类中自己定义的方法包含私有的,不包含从超类继承的
       */
//        Method method = cls.getMethod("test");
        Method method = cls.getDeclaredMethod("test");
        method.setAccessible(true);
        method.invoke(obj);
    }
}
