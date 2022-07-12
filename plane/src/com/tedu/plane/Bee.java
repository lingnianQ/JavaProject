package com.tedu.plane;

import java.util.Random;

/**
 * 蜜蜂：飞行物
 */
public class Bee extends FlyingObject{
    int xSpeed; //x坐标移动速度
    int ySpeed; //y坐标移动速度
    int awardType; //奖励类型
    Bee(){
        super(60,51);
        xSpeed = 1;
        ySpeed = 2;
        Random rand = new Random(); //随机数对象
        awardType = rand.nextInt(2); //0到1之间随机生成
    }
}
