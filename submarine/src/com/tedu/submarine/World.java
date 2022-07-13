package com.tedu.submarine;

import java.util.ArrayList;

/**
 * main
 */
public class World {
    public static void main(String[] args) {

        ArrayList<ObserverSubmarine> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ObserverSubmarine s = new ObserverSubmarine();
            list.add(s);
        }
//        list.forEach(System.out::println);

        SeaObject[] seaObjects = new SeaObject[]{
                new ObserverSubmarine(),
                new MineSubmarine(),
                new TorpedoSubmarine()
        };
        for (SeaObject seaObject : seaObjects) {
            System.out.println(seaObject);
            seaObject.move();
            System.out.println("x: " + seaObject.x);
        }


        Mine[] ms = new Mine[2];
        ms[0] = new Mine(100, 200);
        ms[1] = new Mine(110, 340);
        for (int i = 0; i < ms.length; i++) {
            Mine m = ms[i];
            System.out.println(m);
            m.move();
            System.out.println("y:" + m.y);
        }

        Bomb[] bs = new Bomb[2];
        bs[0] = new Bomb(100,201);
        bs[1] = new Bomb(111,201);
        for (Bomb b : bs) {
            System.out.println(b);
            b.move();
            System.out.println("y:" + b.y);
        }

    }
}
