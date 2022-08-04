package thread;

/**
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中若该线程的interrupt方法被调用,则会打断其睡眠阻塞状态,
 * 此时sleep方法会抛出中断异常:InterruptedException
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread("林永健") {
            public void run() {
                System.out.println(getName() + ":刚美完容,睡一会吧...");
                try {
                    Thread.sleep(50000000);
                } catch (InterruptedException e) {
                    System.out.println(getName() + ":干嘛呢!干嘛呢!干嘛呢!都破了相了!");
                }
                System.out.println(getName() + ":醒了");
            }
        };
        Thread huang = new Thread("黄大锤") {
            public void run() {
                System.out.println(getName() + ":大锤80,小锤40,开始砸墙!");
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + ":80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("咣当!");
                System.out.println(getName() + ":大哥!搞定!");
                lin.interrupt();//中断lin的睡眠阻塞
            }
        };
        lin.start();
        huang.start();
    }
}






