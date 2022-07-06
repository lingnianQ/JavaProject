package day05;

/**
 * 1. 利用for循环计算：求数字1到100之内，所有偶数的和，并输出
 * 2. 利用for循环计算：求8的阶乘，并输出
 * 3. 利用for循环计算：打印字符*组成的等腰三角形，输出结果如下所示：
 */
public class WorkDemo {
    public static void main(String[] args) {
//        extracted();
//        extracted1();
//        extracted2();
//        extracted3();
    }

    private static void extracted3() {
        for (int i = 1, j = 1, k = 9; i <= 9; ) {
            if(k>1){
                k-=2;
                System.out.printf(" ");
            }
            System.out.printf("*");
            j++;

            if (j > i) {
                i += 2;
                j = 1;
                System.out.println();
            }
        }
//        System.out.println();
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= 6 - i; j++) { //空格
//                System.out.printf(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }
    }

    private static void extracted2() {
        //        打印字符*组成的等腰三角形---两层for
        for (int i = 1; i < 20; i += 2) {
            for (int j = 20; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void extracted1() {
        //求8的阶乘
        int res = 1;
        for (int i = 8; i >= 1; i--) {
            res *= i;
        }
        System.out.println(res);
    }

    private static void extracted() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {//1~100所有偶数和
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("数字1到100之内，所有偶数的和" + sum);
    }
}
