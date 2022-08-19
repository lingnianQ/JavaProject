package reflect;

import annotation.AutoRunClass;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/19 9:24
 */

public class ReflectDemo7 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("reflect.Person");
        //看类有没有被 AutoRunClass.class标注
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        System.out.println(mark);
    }
}
