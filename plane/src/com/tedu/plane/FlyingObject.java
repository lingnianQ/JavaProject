package com.tedu.plane;

import java.util.Random;

/**
 * 飞行物
 */
public class FlyingObject {
    int width;  //宽
    int height; //高
    int x;      //x坐标
    int y;      //y坐标

    /**
     * 专门给小敌机、大敌机、小蜜蜂提供的
     */
    //因为小敌机、大敌机、小蜜蜂的宽和高是不同的，意味着数据不能写死，所以传参
    //因为小敌机、大敌机、小蜜蜂的x和y是相同的，意味着数据可以写死
    FlyingObject(int width, int height) {
        this.width = width;
        this.height = height;
        Random rand = new Random(); //随机数对象
        x = rand.nextInt(400 - width); //x:0到(窗口宽-敌人宽)之内的随机数
        y = -height; //y:负的敌人的高
    }

    /**
     * 专门给英雄机、天空、子弹提供的
     */
    //因为英雄机、天空、子弹的宽/高/x/y都是不同的，意味着数据都不能写死，所以传参
    FlyingObject(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    /**
     * 飞行物移动
     */
    void step() {   //step()的处理-----------------明天下午讲
        System.out.println("飞行物移动啦!");
    }
}
