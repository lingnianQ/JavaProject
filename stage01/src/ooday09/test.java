package ooday09;

/**
 * 强转
 * 1.引用所指向的对象，就是该类型
 * 2.引用所指向的对象，实现了该接口或继承了该类
 * 强转前--》  instanceof判断是否属于此类型   ---true
 */
public class test {
    public static void main(String[] args) {
        Aoo o = new Boo();
        Boo o1 = (Boo) o;//引用o所指向的对象，----》Boo  ----符合条件 1.
        Inter o2 = (Inter) o;//引用o所指向的对象，实现了Inter接口--符合条件 2.
//        Coo o3 = (Coo) o; //ClassCastException--类型转换异常
        if (o instanceof Coo) {//----》false
            Coo o4 = (Coo) o;
        } else {
            System.out.println("o不是Coo类型");
        }
    }
}

class Aoo {

}

class Boo extends Aoo implements Inter {

    @Override
    public void show() {

    }
}

class Coo extends Aoo {

}

interface Inter {
    void show();
}