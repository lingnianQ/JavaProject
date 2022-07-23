package apiday01;

import lombok.Data;

public class TestDemo {

    public static void main(String[] args) {

//        String str = "22";
//        int a = Integer.parseInt(str);
//        System.out.println(a);
//        Person person = new Person(110, "ling");
//        person.setName("qwe");
//        person.setId(456);
//        System.out.println(person);

        Aoo aoo1 = new Aoo() {
            @Override
            void show() {
                System.out.println("Aoo");
            }
        };
        System.out.println(aoo1);


        Aoo aoo = new Boo();
        aoo.show();
        aoo.setA(0);
        aoo.setB(2);
        System.out.println(aoo);

        Boo boo = new Boo();
        boo.test();
    }
}

@Data
abstract class Aoo {
    private int a;
    private int b;

    abstract void show();
}

@Data
class Boo extends Aoo implements Inter {
    private String x;

    @Override
    void show() {
        System.out.println("Boo");
    }

    @Override
    public void test() {
//        Inter.super.test();
        System.out.println("Boo---test!");
    }

    @Override
    public void test(int x) {

    }
}

interface Inter {
    default void test() {
        System.out.println("test!!");
    }

    void test(int x);
}