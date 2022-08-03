package thread;

/**
 * 1.继承Thread
 * 2.重写run方法
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();

        t1.start();

        t2.start();

    }
}
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread1--1111--");
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread2---2222-");
        }
    }
}