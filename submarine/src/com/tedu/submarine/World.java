package com.tedu.submarine;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * main
 */
public class World {
    public static void main(String[] args) {
        ArrayList<Battleship> list = new ArrayList<>();
        Battleship s = new Battleship();
        for (int i = 0; i < 100; i++) {
            list.add(s);
        }
        for (Battleship battleship : list) {
            System.out.println(battleship);
        }
        ObserverSubmarine os1 = new ObserverSubmarine();
        ObserverSubmarine os2 = new ObserverSubmarine();
        ObserverSubmarine os3 = new ObserverSubmarine();
        ObserverSubmarine os4 = new ObserverSubmarine();
        TorpedoSubmarine ts1 = new TorpedoSubmarine();
        TorpedoSubmarine ts2 = new TorpedoSubmarine();
        MineSubmarine ms1 = new MineSubmarine();
        MineSubmarine ms2 = new MineSubmarine();
        Mine m1 = new Mine(100, 200);
        Mine m2 = new Mine(123, 435);
        Bomb b1 = new Bomb(200, 300);
        Bomb b2 = new Bomb(145, 234);

        System.out.println(s);
        System.out.println(os1);
        System.out.println(ts1);
        System.out.println(ms1);
        System.out.println(m1);
        System.out.println(b1);
    }
}
