package ooday01;

public class OverloadDemo {
    public static void main(String[] args) {
        Aoo o = new Aoo();
        o.show();
        o.show("lingnian");
        o.show(25);
        o.show("lingnian", 25);
        o.show(25, "lingnian");
        System.out.println(o.show(true));
    }
}
