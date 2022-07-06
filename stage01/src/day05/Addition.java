package day05;

import java.util.Scanner;

/**
 * 随机加法运算器
 */
public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for (int i = 1; i <= 10; i++) {
            //1) 出题 2）答题 3）判题
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int result = a + b;
            System.out.println();
        }
        System.out.println("总分为：" + score);
    }
}
