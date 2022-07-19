package com.tedu.submarine;

import javax.swing.*;

/**
 * 炸弹
 */
public class Bomb extends SeaObject {

    public Bomb(int x, int y) {
        super(9, 12, x, y, 3);
    }

    public void move() {
        y += speed;//y+(向下)
    }

    /**
     * 获取图片
     *
     * @return
     */
    @Override
    public ImageIcon getImage() {
        return Images.bomb;
    }

    /**
     * 重写isOutOfBounds()检测炸弹是否越界
     * 炸弹的 y >= 窗口的高， 越界
     *
     * @return
     */
    @Override
    public boolean isOutOfBounds() {
        return this.y >= World.HEIGHT;
    }
}
