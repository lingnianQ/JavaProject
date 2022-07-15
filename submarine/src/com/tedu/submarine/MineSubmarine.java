package com.tedu.submarine;

import javax.swing.*;

/**
 * 水雷潜艇
 */
public class MineSubmarine extends SeaObject {

    public MineSubmarine() {
        super(63, 20);
    }

    public void move() {
        x += speed;//x+(向右)
        System.out.println("水雷潜艇移动了......!");
    }

    @Override
    public ImageIcon getImage() {
        return Images.minesubm;
    }

}
