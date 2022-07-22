package apiday01;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String line = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        char[] ch = new char[4];
        for (int i = 0; i < 4; i++) {
            int a = random.nextInt(62);
            ch[i] = line.charAt(a);
        }
        String str1 = "" + ch[0] + ch[1] + ch[2] + ch[3];
        System.out.print(str1);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals(str1)) {
            System.out.println("验证码正确");
        } else {
            System.out.println("验证码错误");
        }
    }
}
