package com.tedu.submarine;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.Random;

/**
 * 海洋对象
 * 抽象类--abstract
 */
public abstract class SeaObject implements Serializable {
    public static final int LIVE = 0;
    public static final int DEAD = 1;

    protected int state = LIVE;

    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;

    /**
     * 构造方法
     *
     * @param width
     * @param height
     * @param x
     * @param y
     * @param speed
     */
    public SeaObject(int width, int height, int x, int y, int speed) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    /**
     * 重载构造方法
     *
     * @param width
     * @param height
     */
    public SeaObject(int width, int height) {
        this.width = width;
        this.height = height;
        x = -width; //负的潜艇的
//        x = width; //正潜艇的 测试的
        Random rand = new Random();
        y = rand.nextInt(World.HEIGHT - height - 150 + 1) + 150;
        speed = rand.nextInt(3) + 1; //1~3的随机数
    }

    /**
     * abstract  move
     */
    public abstract void move();

    /**
     * 判断对象是活着的
     */
    public boolean isLive() {
        return state == LIVE;
    }

    /**
     * 判断对象是死了的
     */
    public boolean isDead() {
        return state == DEAD;
    }

    /**
     * 获取对象的图片
     */
    public abstract ImageIcon getImage();

    /**
     * 画对象--g：画笔
     *
     * @param g
     */
    public void paintImage(Graphics g) {
        if (this.isLive()) {
            this.getImage().paintIcon(null, g, this.x, this.y);
        }
    }

    /**
     * 检测潜艇是否越界
     * 潜艇的 x >= 窗口的宽 ---> 越界
     *
     * @return
     */
    public boolean isOutOfBounds() {
        return this.x >= World.WIDTH;
    }

    /**
     * 检测碰撞算法
     *
     * @param seaObject
     * @return true || false
     */
    public boolean isHit(SeaObject seaObject) {
        int x1 = this.x - seaObject.width;
        int x2 = this.x + this.width;
        int y1 = this.y - seaObject.height;
        int y2 = this.y + this.height;
        int x = seaObject.x;
        int y = seaObject.y;
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }

    /**
     * 海洋对象去死
     */
    public void goDead() {
        state = DEAD;
    }
}
