package homework.day08;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 局部变量在栈中
 * 对象在堆里
 * 属性在对象中(在堆里)
 *
 * 基本类型保存的值就是值本身
 * 引用类型保存的值是对象在堆里的地址
 *
 */
public class Demo {
    public static void main(String[] args) {
        String s = "hello";
        int a = 1;
        Point p = new Point(1,2);
        Collection c = new ArrayList();
        c.add(p);
        test(s,a,p,c);
        System.out.println("s:"+s);//?
        System.out.println("a:"+a);//?
        System.out.println("p:"+p);//?
        System.out.println("c:"+c);//?
    }
    public static void test(String s,int a,Point p,Collection c) {
        a++;
        s = s + "world";
        p.setX(3);
        p = new Point(4,5);
        c.clear();
        c.add(p);
        c = new ArrayList();
        p.setX(7);
        c.add(p);
    }
}
