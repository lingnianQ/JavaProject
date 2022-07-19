package com.tedu.submarine;

import javax.swing.*;

/**
 * 观察者潜艇
 * 属性：width,height,x,y,speed
 * 行为：move
 */
public class ObserverSubmarine extends SeaObject {

    public ObserverSubmarine() {
        super(63, 19);
    }

    public void move() {
        x += speed;//x+(向右)
    }

    @Override
    public ImageIcon getImage() {
        return Images.obsersubm;
    }

}
