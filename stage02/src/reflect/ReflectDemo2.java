package reflect;

import java.util.Scanner;

/**
 * 使用反射机制实例化对象
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person p = new Person();
        System.out.println(p);
        /*
            反射机制实例化对象
            1:加载要实例化对象的类的类对象
            2:利用类对象来实例化
         */
        //1
//        Class cls  = Class.forName("reflect.Person");
        /*
            java.util.ArrayList
            java.util.HashMap
            java.util.Date
            reflect.Person
            reflect.Student
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        //2
        Object obj = cls.newInstance();//利用公开的无参的构造器实例化对象new Person()
        System.out.println(obj);

    }
}
