package com.tedu.submarine;

/**
 * 炸弹
 */
public class Bomb {
    int width;
    int height;
    int x;
    int y;
    int speed;

    public Bomb(int x, int y) {
        width = 9;
        height = 12;
        this.x = x;
        this.y = y;
        speed = 3;
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

    void move() {
        System.out.println("炸弹向下移动了！");
    }
}
