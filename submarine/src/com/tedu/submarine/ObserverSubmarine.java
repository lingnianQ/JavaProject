package com.tedu.submarine;

import java.util.Random;

/**
 * 观察者潜艇
 * 属性：width,height,x,y,speed
 * 行为：move
 */
public class ObserverSubmarine {
    int width;
    int height;
    int x;
    int y;
    int speed;

    public ObserverSubmarine() {
        width = 63;
        height = 19;
        x = -width; //负的潜艇的高
        Random rand = new Random();
//        y = rand.nextInt(479 - height - 150 + 1) + 150;
        y = rand.nextInt(311) + 150; //150~460
        speed = rand.nextInt(3) + 1; //1~3的随机数
    }

    @Override
    public String toString() {
        return "ObserverSubmarine{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

    void move() {
        System.out.println("侦察潜艇向右移动了！");
    }
}
