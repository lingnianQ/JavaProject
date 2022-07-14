package com.tedu.submarine;

import javax.swing.*;

/**
 * 图片类
 */
public class Images {
    //公开的,静态的, 图片类型 ,变量名
    public static ImageIcon sea;            //海洋图片
    public static ImageIcon gameover;       //游戏结束图片
    public static ImageIcon battleship;     //战舰图片
    public static ImageIcon obsersubm;      //侦察潜艇图片
    public static ImageIcon torpesubm;       //鱼雷潜艇图片
    public static ImageIcon minesubm;       //水雷潜艇图片
    public static ImageIcon mine;           //水雷图片
    public static ImageIcon bomb;           //炸弹图片

    static {
        sea = new ImageIcon("img/sea.png");
        gameover = new ImageIcon("img/gameover.png");
        battleship = new ImageIcon("img/battleship.png");
        obsersubm = new ImageIcon("img/obsersubm.png");
        torpesubm = new ImageIcon("img/torpesubm.png");
        minesubm = new ImageIcon("img/minesubm.png");
        mine = new ImageIcon("img/mine.png");
        bomb = new ImageIcon("img/bomb.png");
    }
    //测试图片是否读取成功
    public static void main(String[] args) {
        //若读取成功，输出8
        System.out.println(sea.getImageLoadStatus()); //8
        System.out.println(gameover.getImageLoadStatus());
        System.out.println(battleship.getImageLoadStatus());
        System.out.println(obsersubm.getImageLoadStatus());
        System.out.println(torpesubm.getImageLoadStatus());
        System.out.println(minesubm.getImageLoadStatus());
        System.out.println(mine.getImageLoadStatus());
        System.out.println(bomb.getImageLoadStatus());
        System.out.println(System.getProperty("user.dir"));
    }
}
