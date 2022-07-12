package com.tedu.submarine;

import java.util.Random;

/**
 * 海洋对象
 * 基类
 */
public class SeaObject {

    int width;
    int height;
    int x;
    int y;
    int speed;

    SeaObject(int width, int height, int x, int y, int speed) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    SeaObject(int width, int height) {
        this.width = width;
        this.height = height;
        x = -width; //负的潜艇的高
        Random rand = new Random();
        y = rand.nextInt(479 - height - 150 + 1) + 150;
        speed = rand.nextInt(3) + 1; //1~3的随机数
    }

    void move() {
        System.out.println("海洋对象移动了......!");
    }
}
