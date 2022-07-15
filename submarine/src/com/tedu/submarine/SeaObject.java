package com.tedu.submarine;

import javax.swing.*;
import java.util.Random;

/**
 * 海洋对象
 * 基类
 * 抽象类--abstract
 */
public abstract class SeaObject {

    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;

    public SeaObject(int width, int height, int x, int y, int speed) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public SeaObject(int width, int height) {
        this.width = width;
        this.height = height;
        x = -width; //负的潜艇的
        Random rand = new Random();
        y = rand.nextInt(World.HEIGHT - height - 150 + 1) + 150;
        speed = rand.nextInt(3) + 1; //1~3的随机数
    }

    public abstract void move();

    /**
     * 获取对象的图片
     * @return
     */
    public abstract ImageIcon getImage();
}
