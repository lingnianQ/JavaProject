package com.tedu.submarine;

import javax.swing.*;

/**
 * 战舰
 * 属性：width，height，x,y,speed,life
 * 行为：shootBomb(),move(),
 */
public class Battleship extends SeaObject {

    private int life; //生命数量

    public Battleship() {
        super(66, 26, 270, 124, 20);
        life = 5;
    }

    public void move() {
    }

    @Override
    public ImageIcon getImage() {
        return Images.battleship;
    }

    /**
     * 战舰发射炸弹
     *
     * @return
     */
    public Bomb shootBomb() {
        return new Bomb(this.x + 30, this.y);
    }

    public BombUp shootBombUp() {
        return new BombUp(this.x + 30, this.y);
    }

    /**
     * 战舰左移
     */
    public void moveLeft() {
        x -= speed;
    }

    /**
     * 战舰右移
     */
    public void moveRight() {
        x += speed;
    }

    /**
     * 增加生命
     */
    public void addLife(int num) {
        life += num;
    }

    /**
     * 获取命数
     */
    public int getLife() {
        return life;
    }

    /**
     * 战舰减命
     */
    public void subtractLife() {
        life--;
    }
}
