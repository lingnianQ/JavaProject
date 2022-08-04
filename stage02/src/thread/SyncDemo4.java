package thread;

/**
 * 互斥性
 * 当使用多个synchronized锁定多个代码片段并且指定的同步监视器对象是同一个时,这些代码片段之间就是互斥的
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Coo coo = new Coo();
        Thread t1 = new Thread(){
            public void run(){
                coo.methodA();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                coo.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}

class Coo{
    public synchronized void methodA(){//this
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行A方法...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println(t.getName()+":执行A方法完毕!");
    }
    public void methodB(){
        synchronized (this) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行B方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println(t.getName() + ":执行B方法完毕!");
        }
    }
}









