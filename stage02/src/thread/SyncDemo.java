package thread;

import lombok.Synchronized;

/**
 * 多线程并发安全问题:
 * 当多个线程并发操作同一临界资源,由于线程切换实际不确定,导致操作临界资源的完整过程出现混乱从而导致各种
 * 不良后果.
 * 临界资源:操作该资源的完整过程同一时刻只能被单线程进行的资源.
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread() {
            public void run() {
                while (true) {
                    int bean = table.getBean();
                    Thread.yield();//主动要求线程放弃本次剩余时间片.模拟执行到这里时没时间发生切换
                    System.out.println(getName() + ":" + bean);
//                    System.err.println();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    int bean = table.getBean();
                    Thread.yield();//主动要求线程放弃本次剩余时间片.模拟执行到这里时没时间发生切换
                    System.out.println(getName() + ":" + bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Table {
    private int beans = 20;//桌子上有20个豆子

    public synchronized int getBean() {
        if (beans == 0) {//桌子上没有豆子了
            throw new RuntimeException("没有豆子了!");
        }
        Thread.yield();//主动要求线程放弃本次剩余时间片.模拟执行到这里时没时间发生切换
        return beans--;
    }
}







