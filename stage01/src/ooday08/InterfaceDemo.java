package ooday08;

/**
 * 接口的演示
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter5 o1 = new Doo();//向上造型
        Inter4 o2 = new Doo();//向上造型
    }
}

interface Inter {

    int COUNT = 5;//需要声明并初始化----接口默认为 public static final

    void show();//public
}

interface Inter1 {

    void test();

}

abstract class Boo {
    abstract void say();
}

/**
 * 接口是一种数据类型--（引用类型）
 * 一个类可以实现多个接口
 * 先继承后实现
 * 接口是需要被实现/继承的，重写所有抽象方法
 */
class Aoo extends Boo implements Inter, Inter1 {

    @Override
    public void show() { //实现接口需要访问权限大于或者等于 public

    }

    @Override
    public void test() {

    }

    @Override
    void say() {

    }
}

/**
 * interface --extends
 */
interface Inter4 {
    void show();
}

interface Inter5 extends Inter4 {
    void test();
}

class Doo implements Inter5 {

    @Override
    public void show() {

    }

    @Override
    public void test() {

    }
}




