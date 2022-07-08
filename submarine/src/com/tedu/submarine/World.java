package com.tedu.submarine;

/**
 * main
 */
public class World {
    public static void main(String[] args) {
        Battleship s = new Battleship();
        s.width = 20;
        s.height = 30;
        s.x = 100;
        s.y = 200;
        s.speed = 20;
        System.out.println(s.width + "," + s.height + "," + s.x + "," + s.y + s.speed);
        s.move();

        ObserverSubmarine os1 = new ObserverSubmarine();
        os1.width = 20;
        os1.height = 30;
        os1.x = 100;
        os1.y = 200;
        os1.speed = 20;
        System.out.println(os1.width + "," + os1.height + "," + os1.x + "," + os1.y + os1.speed);
        os1.move();

        ObserverSubmarine os2 = new ObserverSubmarine();
        os1.width = 20;
        os1.height = 30;
        os1.x = 100;
        os1.y = 200;
        os1.speed = 20;
        System.out.println(os1.width + "," + os1.height + "," + os1.x + "," + os1.y + os1.speed);
        os1.move();

        TorpedoSubmarine ts1 = new TorpedoSubmarine();
        ts1.width = 46;
        ts1.height = 56;
        ts1.x = 568;
        ts1.y = 569;
        ts1.speed = 56;
        System.out.println(ts1.x);
        ts1.move();

        TorpedoSubmarine ts2 = new TorpedoSubmarine();
        ts2.width = 20;
        ts2.height = 20;
        ts2.x = 20;
        ts2.y = 20;
        ts2.speed = 20;
        System.out.println(ts2.x);
        ts2.move();
        MineSubmarine ms1 = new MineSubmarine();
        ms1.width = 50;
        ms1.height = 50;
        ms1.x = 50;
        ms1.y = 50;
        ms1.speed = 50;
        System.out.println(ms1.x);
        ms1.move();

        MineSubmarine ms2 = new MineSubmarine();
        ms2.width = 50;
        ms2.height = 50;
        ms2.x = 50;
        ms2.y = 50;
        ms2.speed = 50;
        System.out.println(ms2.x);
        ms1.move();

        Mine m1 = new Mine();
        m1.width = 50;
        m1.height = 50;
        m1.x = 50;
        m1.y = 50;
        m1.speed = 50;
        System.out.println(m1.x);
        m1.move();

        Mine m2 = new Mine();
        m2.width = 50;
        m2.height = 50;
        m2.x = 50;
        m2.y = 50;
        m2.speed = 50;
        System.out.println(m2.x);
        m2.move();

        Bomb b1 = new Bomb();
        b1.width = 50;
        b1.height = 50;
        b1.x = 50;
        b1.y = 50;
        b1.speed = 50;
        System.out.println(b1.x);
        b1.move();

        Bomb b2 = new Bomb();
        b2.width = 50;
        b2.height = 50;
        b2.x = 50;
        b2.y = 50;
        b2.speed = 50;
        System.out.println(b2.x);
        b2.move();
    }
}
