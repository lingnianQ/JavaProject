package com.tedu.submarine;

/**
 * 鱼雷潜艇
 */
public class TorpedoSubmarine extends SeaObject {

    public TorpedoSubmarine() {
        super(64, 20);
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
