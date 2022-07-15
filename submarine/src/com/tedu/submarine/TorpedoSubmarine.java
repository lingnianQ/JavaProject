package com.tedu.submarine;

import javax.swing.*;

/**
 * 鱼雷潜艇
 */
public class TorpedoSubmarine extends SeaObject {

    public TorpedoSubmarine() {
        super(64, 20);
    }

    public void move() {
        x += speed;//x+(向右)
        System.out.println("鱼雷潜艇移动了......!");
    }

    @Override
    public ImageIcon getImage() {
        return Images.torpesubm;
    }

}
