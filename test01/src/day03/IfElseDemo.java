package day03;

/**
 * IfElseDemo
 */
public class IfElseDemo {
    public static void main(String[] args) {
        int score = 540;
        if (score >= 0 && score <= 100) {
            System.out.println("成绩合法");
        } else {
            System.out.println("成绩不合法");
        }


        /*
        &&  优先级大于 或  ||
         */
        int year = 2001;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("平年   ");
        }
    }
}
