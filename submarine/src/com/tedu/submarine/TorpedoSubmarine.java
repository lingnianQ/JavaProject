package com.tedu.submarine;

import java.util.Random;

/**
 * 鱼雷潜艇
 */
public class TorpedoSubmarine {
    int width;
    int height;
    int x;
    int y;
    int speed;

    public TorpedoSubmarine() {
        width = 64;
        height = 20;
        x = -width; //负的潜艇的高
        Random rand = new Random();
        y = rand.nextInt(479 - height - 150 + 1) + 150;
        speed = rand.nextInt(3) + 1; //1~3的随机数
    }

    void move() {
        System.out.println("鱼雷潜艇向右移动了！");
    }
}
