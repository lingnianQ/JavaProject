package thread;

import java.util.Scanner;

/**
 * 线程的静态方法：
 * static void sleep(long ms)
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("程序开始了！！");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        while (i != 0) {
            Thread.sleep(1000);
            System.out.println(--i);
        }
        System.out.println("程序结束了！！");

    }
}
