package com.tedu.submarine;

/**
 * 鱼雷潜艇
 */
public class TorpedoSubmarine extends SeaObject {

    public TorpedoSubmarine() {
        super(64, 20);
    }

    void move() {
        x += speed;//x+(向右)
        System.out.println("鱼雷潜艇移动了......!");
    }

    @Override
    public String toString() {
        return "TorpedoSubmarine{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

}
