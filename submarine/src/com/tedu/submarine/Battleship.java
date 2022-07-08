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

    void move(){
        System.out.println("战舰移动了");
    }
}
