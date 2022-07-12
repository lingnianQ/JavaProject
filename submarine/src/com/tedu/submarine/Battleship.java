package com.tedu.submarine;

/**
 * 战舰
 * 属性：width，height，x,y,speed,life
 * 行为：shootBomb(),move(),
 */
public class Battleship extends SeaObject {

    int life; //生命数量

    Battleship() {
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

}
