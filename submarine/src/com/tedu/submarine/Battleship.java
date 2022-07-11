package com.tedu.submarine;

/**
 * 战舰
 * 属性：width，height，x,y,speed,life
 * 行为：shootBomb(),move(),
 */
public class Battleship {
    int width;
    int height;
    int x;
    int y;
    int speed;
    int life;

    public Battleship() {
        width = 66;
        height = 26;
        x = 270;
        y = 124;
        speed = 20;
        life = 5;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                ", life=" + life +
                '}';
    }

    void move() {
        System.out.println("战舰移动了");
    }
}
