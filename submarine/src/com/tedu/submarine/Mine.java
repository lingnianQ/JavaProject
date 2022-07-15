package com.tedu.submarine;

import javax.swing.*;

/**
 * 水雷
 */
public class Mine extends SeaObject {

    public Mine(int x, int y) { //每个水雷初始坐标不一样，需要传参
        super(11, 11, x, y, 1);
    }

    public void move() {
        y -= speed;//y-(向上)
        System.out.println("水雷移动了......!");
    }

    @Override
    public ImageIcon getImage() {
        return Images.mine;
    }

}
