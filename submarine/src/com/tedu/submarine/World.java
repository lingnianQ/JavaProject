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


    }
}
