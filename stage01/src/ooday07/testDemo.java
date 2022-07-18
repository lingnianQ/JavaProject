package ooday07;

public class testDemo {
    public static void main(String[] args) {

        Aoo aoo = new Aoo();
//        Aoo.Boo boo = new Aoo.Boo()
    }

}

class Aoo {
    abstract class Boo {
        abstract void show();
    }

    Boo boo = new Boo() {
        @Override
        void show() {
            System.out.println("123213");
        }
    };
}
