package com.tedu.submarine;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class GameInfo implements Serializable {
    /* 对象 */
    private Battleship ship;//战舰对象
    private SeaObject[] submarines;//潜艇数组
    private Mine[] mines;//水雷数组
    private Bomb[] bombs; //炸弹数组
    private BombUp[] bombsUP; //炸弹数组UP

    private int subEnterIndex;//潜艇入场计数
    private int mineEnterIndex;

    private int score;

}
