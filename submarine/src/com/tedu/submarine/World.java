package com.tedu.submarine;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * main
 */
public class World extends JPanel {
    public static final int WIDTH = 641;
    public static final int HEIGHT = 479;

    public static final int RUNNING = 0;
    public static final int PAUSE = 1;
    public static final int GAME_OVER = 2;
    private int state = RUNNING;

    /* 对象 */
    private Battleship ship = new Battleship();//战舰对象
    private SeaObject[] submarines = {};//潜艇数组
    private Mine[] mines = {};//水雷数组
    private Bomb[] bombs = {}; //炸弹数组
    private BombUp[] bombsUP = {}; //炸弹数组UP

    /**
     * 生成潜艇（侦察潜艇、鱼雷潜艇、水雷潜艇）对象
     *
     * @return SeaObject
     */
    private SeaObject nextSubmarine() {
        Random random = new Random();
        int type = random.nextInt(30);//0~19随机数
        if (type < 10) {
            return new ObserverSubmarine();
        } else if (type < 20) {
            return new TorpedoSubmarine();
        } else {
            return new MineSubmarine();
        }
    }

    /**
     * 潜艇（侦察艇、鱼雷潜艇、水雷潜艇入场）--10ms 一次
     */
    private int subEnterIndex = 0;//潜艇入场计数

    private void submarineEnterAction() {
        subEnterIndex++;
        if (subEnterIndex % 40 == 0) { //400ms 走一次
            SeaObject obj = nextSubmarine(); //获取潜艇对象
            submarines = Arrays.copyOf(submarines, submarines.length + 1);
            submarines[submarines.length - 1] = obj;//将obj添加到最后一个元素上
        }
    }

    /**
     * 水雷入场
     */
    private int mineEnterIndex = 0;

    private void mineEnterAction() {//10ms 一次
        mineEnterIndex++;//每10ms +1
        if (mineEnterIndex % 100 == 0) {//每1000ms走一次
            for (int i = 0; i < submarines.length; i++) {
                if (submarines[i] instanceof MineSubmarine) {
                    MineSubmarine ms = (MineSubmarine) submarines[i];
                    Mine obj = ms.shootMine();
                    mines = Arrays.copyOf(mines, mines.length + 1);
                    mines[mines.length - 1] = obj;
                }
            }
        }
    }

    /**
     * 海洋对象移动
     */
    private void moveAction() {//10ms 走一次
        Arrays.stream(submarines).forEach(SeaObject::move);
        Arrays.stream(mines).forEach(SeaObject::move);
        Arrays.stream(bombs).forEach(SeaObject::move);
        /*
         * 炸弹移动
         */
        Arrays.stream(bombsUP).forEach(SeaObject::move);
    }

    /**
     * 删除越界的海洋对象
     * 删除死亡的元素
     */
    private void OutOfBoundsAction() {//10ms 一次
        for (int i = 0; i < submarines.length; i++) {
            if (submarines[i].isOutOfBounds() || submarines[i].isDead()) {
                submarines[i] = submarines[submarines.length - 1];
                submarines = Arrays.copyOf(submarines, submarines.length - 1);
            }
        }

        for (int i = 0; i < mines.length; i++) {
            if (mines[i].isOutOfBounds() || mines[i].isDead()) {
                mines[i] = mines[mines.length - 1];
                mines = Arrays.copyOf(mines, mines.length - 1);
            }
        }
        for (int i = 0; i < bombs.length; i++) {
            if (bombs[i].isOutOfBounds() || bombs[i].isDead()) {
                bombs[i] = bombs[bombs.length - 1];
                bombs = Arrays.copyOf(bombs, bombs.length - 1);
            }
        }
    }

    /**
     * 炸弹与潜艇 碰撞
     */
    private int score = 0;

    private void bombBangAction() {
        for (int i = 0; i < bombs.length; i++) {//遍历所有炸弹
            Bomb b = bombs[i];//获取每一个炸弹
            for (int j = 0; j < submarines.length; j++) {//遍历所有潜艇
                SeaObject s = submarines[j];//获取每一个潜艇
                if (b.isLive() && s.isLive() && s.isHit(b)) {
                    s.goDead();//潜艇去死
                    b.goDead();//炸弹去死
                    if (s instanceof EnemyScore) {
                        EnemyScore es = (EnemyScore) s;
                        score += es.getScore();
                    }
                    if (s instanceof EnemyLife) {
                        EnemyLife el = (EnemyLife) s;
                        int num = el.getLife();
                        ship.addLife(num);
                    }
                }
            }
        }
    }

    /**
     * 水雷与战舰的碰撞
     */
    private void mineBangAction() {
        for (Mine mine : mines) {
            if (mine.isLive() && ship.isLive() && mine.isHit(ship)) {
                mine.goDead();//水雷去死
                ship.subtractLife();//战舰减命
            }
        }
    }

    /**
     * 游戏结束
     */
    private void checkGameOverAction() {
        if (ship.getLife() <= 0) {
            state = GAME_OVER;
        }
    }

    /**
     * 启动程序的执行--对象运动
     */
    private void action() {
        File file = new File("./submarine/src/game.sav");
        if (file.exists()) {
            int r = JOptionPane.showConfirmDialog(World.this, "是否读取存档");
            if (r == JOptionPane.YES_OPTION) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    Object o = objectInputStream.readObject();
                    GameInfo gameInfo = (GameInfo) o;
                    ship = gameInfo.getShip();
                    submarines = gameInfo.getSubmarines();
                    mines = gameInfo.getMines();
                    bombs = gameInfo.getBombs();
                    bombsUP = gameInfo.getBombsUP();
                    subEnterIndex = gameInfo.getSubEnterIndex();
                    mineEnterIndex = gameInfo.getMineEnterIndex();
                    score = gameInfo.getScore();

                    objectInputStream.close();
                } catch (Exception e) {

                }

            }
        }
        KeyAdapter k = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_P) {
                    if (state == RUNNING) {
                        state = PAUSE;
                        int r = JOptionPane.showConfirmDialog(
                                World.this,
                                "保存游戏吗？？？？？？？"
                        );
                        if (r == JOptionPane.YES_OPTION) {
                            GameInfo gameInfo = new GameInfo(ship, submarines, mines, bombs, bombsUP, subEnterIndex, mineEnterIndex, score);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream("./submarine/src/game.sav");
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                                objectOutputStream.writeObject(gameInfo);
                                objectOutputStream.close();
                            } catch (Exception exception) {

                            }
                        }
                    } else if (state == PAUSE) {
                        state = RUNNING;
                    }
                }

                if (state == RUNNING) {
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        Bomb obj = ship.shootBomb();
                        bombs = Arrays.copyOf(bombs, bombs.length + 1);
                        bombs[bombs.length - 1] = obj;
                        /*
                         * 其他方向---0---炸弹发射
                         */
                        BombUp objUp = ship.shootBombUp();
                        bombsUP = Arrays.copyOf(bombsUP, bombsUP.length + 1);
                        bombsUP[bombsUP.length - 1] = objUp;
                    }
                }
            }

            /**
             * 战舰移动 --键盘左右键
             */
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    ship.moveLeft();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ship.moveRight();
                }
            }
        };
        this.addKeyListener(k);//--侦听器
        /**
         * 定时器
         */
        Timer timer = new Timer();//定时器对象
        //定时间隔（以毫秒为单位）
        int interval = 10;
        timer.schedule(new TimerTask() {
                           @Override
                           public void run() {//定时干的事--interval
                               if (state == RUNNING) {
                                   submarineEnterAction();//潜艇（侦察艇、鱼雷潜艇、水雷潜艇入场）
                                   mineEnterAction(); //水雷入场
                                   moveAction();     //海洋对象移动
                                   OutOfBoundsAction();//删除越界元素
                                   bombBangAction();
                                   mineBangAction();
                                   checkGameOverAction();
                                   System.out.println(submarines.length + " +" + mines.length + " +   " + bombs.length + "+" + bombsUP.length);
                                   repaint();
                               }
                           }
                       },
                interval,
                interval);
    }


    /**
     * 重写paint ,画笔g
     */
    @Override
    public void paint(Graphics g) {
        Images.sea.paintIcon(null, g, 0, 0);
        ship.paintImage(g);
        for (SeaObject submarine : submarines) {
            submarine.paintImage(g);
        }
        Arrays.stream(mines).forEach(mine -> mine.paintImage(g));
        for (Bomb bomb : bombs) {
            bomb.paintImage(g);
        }
        /*
         * 炸弹移动
         */
        for (BombUp bombUp : bombsUP) {
            bombUp.paintImage(g);
        }
        g.drawString("SCORE:" + score, 200, 50);
        g.drawString("LIFE:" + ship.getLife(), 400, 50);
        if (state == GAME_OVER) {
            Images.gameover.paintIcon(null, g, 0, 0);
        }
    }

    public static void main(String[] args) {
        /*
         * swing 图形化页面
         */
        JFrame frame = new JFrame();
        World world = new World();//创建窗口中的那一堆对象
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH + 16, HEIGHT + 39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//系统自动调用paint（）方法

        world.action(); //启动程序执行
    }
}
