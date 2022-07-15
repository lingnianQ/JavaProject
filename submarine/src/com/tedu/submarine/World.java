package com.tedu.submarine;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * main
 */
public class World extends JPanel {
    public static final int WIDTH = 641;
    public static final int HEIGHT = 479;

    /* 对象 */
    private Battleship ship = new Battleship();//战舰对象
    private SeaObject[] submarines = {
            new ObserverSubmarine(),
            new TorpedoSubmarine(),
            new MineSubmarine()
    };//潜艇数组
    private Mine[] mines = {
            new Mine(280, 200)
    };//水雷数组
    private Bomb[] bombs = {
            new Bomb(200, 250)
    }; //炸弹数组

    /**
     * 重写paint ,画笔g
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        Images.sea.paintIcon(null, g, 0, 0);
        ship.paintImage(g);
        for (SeaObject submarine : submarines) {
            submarine.paintImage(g);
        }
        for (Mine mine : mines) {
            mine.paintImage(g);
        }
        for (Bomb bomb : bombs) {
            bomb.paintImage(g);
        }
    }

    public static void main(String[] args) {
        /*
         * swing 图形化页面
         */
        JFrame frame = new JFrame();
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH + 16, HEIGHT + 39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        ArrayList<ObserverSubmarine> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ObserverSubmarine s = new ObserverSubmarine();
            list.add(s);
        }
        list.forEach(System.out::println);

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
        bs[0] = new Bomb(100, 201);
        bs[1] = new Bomb(111, 201);
        for (Bomb b : bs) {
            System.out.println(b);
            b.move();
            System.out.println("y:" + b.y);
        }

    }
}
