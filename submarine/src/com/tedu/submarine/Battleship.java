package com.tedu.submarine;

/**
 * 战舰
 * 属性：width，height，x,y,speed,life
 * 行为：shootBomb(),move(),
 */
public class Battleship extends SeaObject {

    int life; //生命数量

    Battleship() {
        super(66, 26, 270, 124, 20);
        life = 5;
    }

    void move() {
        System.out.println("战舰移动了......!");
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

}
