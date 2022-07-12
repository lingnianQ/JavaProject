package com.tedu.submarine;

import java.util.ArrayList;
import java.util.LinkedList;

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
//        System.out.println(list);

        ObserverSubmarine[] oses = new ObserverSubmarine[3];
        oses[0] = new ObserverSubmarine();
        oses[1] = new ObserverSubmarine();
        oses[2] = new ObserverSubmarine();
        for (ObserverSubmarine ose : oses) {
            System.out.println(ose);
            ose.move();
        }
        TorpedoSubmarine[] tses = new TorpedoSubmarine[2];
        tses[0] = new TorpedoSubmarine();
        tses[1] = new TorpedoSubmarine();
        for (TorpedoSubmarine tse : tses) {
            System.out.println(tse);
            tse.move();
        }
        MineSubmarine[] mses = new MineSubmarine[3];
        mses[0] = new MineSubmarine();
        mses[1] = new MineSubmarine();
        mses[2] = new MineSubmarine();
        for (int i = 0; i < mses.length; i++) {
            System.out.println(mses[i]);
            mses[i].move();
        }
        Mine[] ms = new Mine[2];
        ms[0] = new Mine(100,200);
        ms[1] = new Mine(110,340);
        for (int i = 0; i < ms.length; i++) {
            System.out.println(ms[i]);
            ms[i].move();
        }
        Bomb[] bs = new Bomb[4];
    }
}
