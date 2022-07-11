package com.tedu.submarine;

import java.util.Random;

/**
 * 水雷
 */
public class Mine {
    int width;
    int height;
    int x;
    int y;
    int speed;

    Mine(int x, int y) { //每个水雷初始坐标不一样，需要传参
        width = 11;
        height = 11;
        this.x = x;
        this.y = y;
        speed = 1;
    }

    @Override
    public String toString() {
        return "Mine{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

    void move() {
        System.out.println("水雷向右移动了！");
    }
}
