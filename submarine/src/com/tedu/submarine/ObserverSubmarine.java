package com.tedu.submarine;

/**
 * 观察者潜艇
 * 属性：width,height,x,y,speed
 * 行为：move
 */
public class ObserverSubmarine {
    int width;
    int height;
    int x;
    int y;
    int speed;

    void move() {
        System.out.println("侦察潜艇向右移动了！");
    }
}
