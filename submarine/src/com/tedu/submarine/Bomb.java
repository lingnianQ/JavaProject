package com.tedu.submarine;

import javax.swing.*;

/**
 * 炸弹
 */
public class Bomb extends SeaObject {

    public Bomb(int x, int y) {
        super(9, 12, x, y, 3);
    }

    public void move() {
        y += speed;//y+(向下)
        System.out.println("炸弹移动了......!");
    }

    @Override
    public ImageIcon getImage() {
        return Images.bomb;
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

}
