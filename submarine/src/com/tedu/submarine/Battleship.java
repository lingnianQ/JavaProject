package com.tedu.submarine;

import javax.swing.*;

/**
 * 战舰
 * 属性：width，height，x,y,speed,life
 * 行为：shootBomb(),move(),
 */
public class Battleship extends SeaObject {

    private int life; //生命数量

    public Battleship() {
        super(66, 26, 270, 124, 20);
        life = 5;
    }

    public void move() {
        System.out.println("战舰移动了......!");
    }

    @Override
    public ImageIcon getImage() {
        return Images.battleship;
    }

}
