package ooday04;

public class UploadDemo {
    public static void main(String[] args) {
        Aoo a1 = new Aoo(); //超类不可以访问派生类
        a1.show();
        a1.a = 1;

        Boo b1 = new Boo(); //派生类可以访问超类
        b1.a = 1;
        b1.b = 1;
        b1.show();
        b1.test();

        Aoo a2 = new Boo(); //向上造型
        a2.show();
        a2.a = 1;
    }
}
class Aoo {
    int a;
    void show(){
        System.out.println("AOO,show!!");
    }
}
class Boo extends Aoo{
    int b;
    void test(){
        System.out.println("Boo,test!!!");
    }
}