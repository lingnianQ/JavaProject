package ooday05;

/**
 * 访问控制符
 * private 本类
 * public  任何类
 * protect 本类，派生类，同包类---跨包继承
 * default 本类，同包类
 * <p>
 * final :
 * 修饰变量：变量不能被改变
 * 修饰方法：方法不能被重写--可以被重载
 * 修饰类：类不能被继承
 * <p>
 * 成员变量：
 * 实例变量：没有static修饰，属于对象的，存储在堆中，
 * 静态变量：static修饰，存储在方法区，只有一份，常用 类名.来访问
 * <p>
 * static :
 * 静态方法中没有隐士this传递
 * 没有this就意味着没有对象
 * 而实例变量 必须通过对象来访问
 * 若方法 不需要访问对象的属性和行为，说明方法的操作与对象无关，可以使用static（静态方法）
 */
public class Aoo {
    int a = 0;
    static int b = 0;

    Aoo() {
        a++;
        b++;
    }

    @Override
    public String toString() {
        return "Aoo{" +
                "a=" + a + " ," +
                "b=" + b +
                '}';
    }
}

