package com.tedu.submarine;

import javax.swing.*;

public class BombUp extends SeaObject {
    public BombUp(int x, int y) {
        super(9, 12, x, y, 3);
    }

    @Override
    public void move() {
        y += speed;//y-(向下)
        x += speed;
    }

    public void moveUp() {
        y -= speed;//y-(向下)
    }

    @Override
    public ImageIcon getImage() {
        return Images.bomb;
    }

    @Override
    public boolean isOutOfBounds() {
        return this.y >= World.HEIGHT;
    }

}
