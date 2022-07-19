package com.tedu.submarine;

import javax.swing.*;

/**
 * 水雷潜艇
 */
public class MineSubmarine extends SeaObject implements EnemyLife {

    public MineSubmarine() {
        super(63, 20);
    }

    public void move() {
        x += speed;//x+(向右)
    }

    @Override
    public ImageIcon getImage() {
        return Images.minesubm;
    }

    /**
     * 水雷发射
     *
     * @return
     */
    public Mine shootMine() {
        //水雷的x:水雷潜艇的x+水雷潜艇的width
        //水雷的y:水雷潜艇的y-水雷的高(11)
        return new Mine(this.x + this.width, this.y - 11); //this指水雷潜艇对象
    }

    /**
     * @return life==1
     */
    @Override
    public int getLife() {
        return 1;
    }
}
