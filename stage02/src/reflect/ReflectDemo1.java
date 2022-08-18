package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * JAVA反射机制
 * 反射机制是一个动态机制,它允许我们在程序[运行期间]再确定实例化,方法的调用,属性的操作
 * 等.使得程序的灵活度大大提高.但是随之带来了更多的系统开销和较低的运行效率.
 * 因此:反射机制不能被过度使用.
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
       /*
            使用反射机制的第一步:获取要操作的类的类对象,即:Class的实例
            JVM中被加载的类都有且只有一个Class的实例与之对应,该实例就称为
            被加载的这个类的类对象.
            类对象上会记录这其表示的类的一切信息(类名,方法信息,属性信息等)
            获取一个类的类对象方式:
            1:类名.class:
            Class cls = String.class;
            Class cls = int.class;

            2:Class.forName(String className)
            Class cls = Class.forName("java.lang.String")
            参数要求是要加载的类的完全限定名:包名+类名

            3:类加载器ClassLoader形式加载
        */
        //获取String的类对象
//        Class cls = String.class;
//        Class cls = ArrayList.class;

//        Class cls = Class.forName("java.lang.String");
        /*
            java.lang.String
            java.util.ArrayList
            java.util.HashMap
            java.io.FileInputStream
            reflect.Person
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        //通过类对象获取String的一切信息
        //查看类名
        String name = cls.getName();
        System.out.println(name);
        name = cls.getSimpleName();
        System.out.println(name);

        Package p = cls.getPackage();
        System.out.println("包名:"+p.getName());


        /*
            Class称为类对象,其每一个实例用于表示一个类的信息
            Method称为方法对象,其每一个实例用于表示一个方法的信息
            通过Method可以:
            获取一个方法的所有信息(方法名,参数信息,返回值类型,访问修饰符等)
            可以通过对象执行这个方法.
         */
        Method[] methods = cls.getMethods();//获取String的所有方法
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }
}
