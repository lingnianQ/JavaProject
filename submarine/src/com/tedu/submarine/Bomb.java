package com.tedu.submarine;

/**
 * 炸弹
 */
public class Bomb extends SeaObject {

    Bomb(int x, int y) {
        super(9, 12, x, y, 3);
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }

}
