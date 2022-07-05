package day04;

import java.util.Scanner;

/**
 * Scanner 使用
 */
public class ScannerDemo {
    public static void main(String[] args) {
        ScoreLevel();
        CommandBySwitch();
    }

    private static void ScoreLevel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩：");
        double score = sc.nextDouble();
        System.out.println("成绩为：" + score);
    }

    private static void CommandBySwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入command命令：");
        int command = sc.nextInt();
        System.out.println("command为：" + command);
    }

}
