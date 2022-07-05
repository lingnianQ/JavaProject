package day04;

/**
 * 循环使用
 */
public class ForDemo {
    public static void main(String[] args) {
//        nine1();
        nine2();
    }

    private static void nine1() {
        for (int i = 1, j = 1; i <= 9; ) {
            System.out.printf("%d*%d=%d\t", j, i, i * j);
            j++;
            if (j > i) {
                i++;
                j = 1;
                System.out.println();
            }
        }
    }

    private static void nine2() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.printf("    ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
