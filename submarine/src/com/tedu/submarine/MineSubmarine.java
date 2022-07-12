package com.tedu.submarine;

/**
 * 水雷潜艇
 */
public class MineSubmarine extends SeaObject {

    public MineSubmarine() {
        super(63, 20);
    }

    @Override
    public String toString() {
        return "MineSubmarine{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

}
