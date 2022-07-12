package com.tedu.submarine;

/**
 * 观察者潜艇
 * 属性：width,height,x,y,speed
 * 行为：move
 */
public class ObserverSubmarine extends SeaObject {

    public ObserverSubmarine() {
        super(63, 19);
    }

    @Override
    public String toString() {
        return "ObserverSubmarine{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

}