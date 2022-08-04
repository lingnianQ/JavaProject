package thread;

/**
 * 守护线程
 * 守护线程是通过普通线程(我们正常创建的线程.普通线程也称为前台线程,用户线程)调用方法setDaemon(true)
 * 设置转变而来的.
 * 守护线程与普通线程的区别是进程结束时的一个区别:
 * 当java进程中所有的普通线程都结束时,进程就会结束,此时会强制杀死所有还在运行的守护线程.
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread("rose") {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + " :let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println(getName() + " :啊啊啊啊啊啊AAAAAaaaaaa....");
            }
        };

        Thread jack = new Thread("jack") {
            @Override
            public void run() {
                while (true) {
                    System.out.println(getName() + ":you jump! i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        rose.start();
        //设置守护线程这件事必须在线程启动前进行--否则会抛出异常
        jack.setDaemon(true);
        jack.start();

//        while (true);
    }
}
