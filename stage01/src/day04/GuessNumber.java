package day04;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 */
public class GuessNumber {
    public static void main(String[] args) {
        guessNumber();
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
