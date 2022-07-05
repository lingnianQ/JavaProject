package day04;

import java.util.Scanner;

/**
 * 1. 接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
 * 2. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
 * 3. 利用循环语句while计算数字1到100的和，并输出
 */
public class WorkDemo {
    public static void main(String[] args) {
//        work1();
//        work2();
        work3();
    }

    private static void work3() {
        int n = 1, sum = 0;
        while (n <= 100) {
            sum = sum + n;
            n++;
        }
        System.out.println(sum);
    }

    private static void work2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        int days = 0; //天数
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
        }
        System.out.println(year + "年的" + month + "月共" + days + "天");
    }

    private static void work1() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("+");
        else if (num < 0)
            System.out.println("-");
        else
            System.out.println("0");
    }
}
