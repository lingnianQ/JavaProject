package day04;

import java.util.Scanner;

/**
 * Scanner 使用
 */
public class ScannerDemo {
    public static void main(String[] args) {
        ScoreLevel();
//        CommandBySwitch();
    }

    private static void ScoreLevel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩：");
        double score = sc.nextDouble();
        if (score > 100 || score < 0)
            System.out.println("成绩不合法！！");
        else if (score >= 90)
            System.out.println("优秀！！");
        else if (score >= 80)
            System.out.println("良好！！");
        else if (score >= 70)
            System.out.println("不错！！");
        else if (score >= 60)
            System.out.println("及格！！");
        else
            System.out.println("不及格");
        System.out.println("成绩为：" + score);
    }

    private static void CommandBySwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入command命令：");
        int command = sc.nextInt();
        System.out.println("command为：" + command);
    }

}
