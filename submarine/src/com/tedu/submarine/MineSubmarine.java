package com.tedu.submarine;

import java.util.Random;

/**
 * 水雷潜艇
 */
public class MineSubmarine extends SeaObject{

    public MineSubmarine() {
        width = 63;
        height = 20;
        x = -width; //负的潜艇的高
        Random rand = new Random();
        y = rand.nextInt(479 - height - 150 + 1) + 150;
        speed = rand.nextInt(3) + 1; //1~3的随机数
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
