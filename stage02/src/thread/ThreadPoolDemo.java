package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池是线程的管理机制，主要解决两个问题
 * 1.控制线程数量
 * 2.重复使用线程
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/19 16:56
 */

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //1. 创建一个容量为2的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        //2. 指派任务
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName() + " :正在执行任务... " + finalI);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                    }
                    System.out.println(t.getName() + " :任务执行完毕...." + finalI);
                }
            };
            threadPool.execute(runnable);
            System.out.println("指派了一个任务给线程池..." + finalI);
        }
        threadPool.shutdown();
//        threadPool.shutdownNow();
        System.out.println("线程池关闭了...");
    }
}
