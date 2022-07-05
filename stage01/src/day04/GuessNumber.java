package day04;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字--while
 * Math.random() 0~0.9999999-----
 * <p>
 * do...while ,先执行后判断，至少执行一次
 */
public class GuessNumber {
    public static void main(String[] args) {
//        System.out.println((int) (Math.random() * 100 + 1));

//        guessNumber();
        guessNumber2();
    }

    private static void guessNumber2() {
        Random random = new Random();
        int numRan = random.nextInt(100) + 1;
        System.out.println(numRan);
        Scanner sc = new Scanner(System.in);
        System.out.println("猜数字----1~100之内：");
        int i;
        do {
            i = sc.nextInt();
            if (i > numRan)
                System.out.println("猜大了！！！！");
            else if (i < numRan)
                System.out.println("猜小了！！！！");
            else {
                System.out.println("猜对了！！！");
//                break;
            }
        } while (i != numRan);
    }

    private static void guessNumber() {
        Random random = new Random();
        int numRan = random.nextInt(100) + 1;
//        System.out.println(numRan);
        Scanner sc = new Scanner(System.in);
        System.out.println("猜数字----1~100之内：");
        while (true) {
            int i = sc.nextInt();
            if (i > numRan)
                System.out.println("猜大了！！！！");
            else if (i < numRan)
                System.out.println("猜小了！！！！");
            else {
                System.out.println("猜对了！！！");
                break;
            }
        }
    }
}
