package day05;

/**
 * 九九乘法表
 */
public class MultiTable {
    public static void main(String[] args) {
//        extracted();
        extracted1();
    }

    private static void extracted1() {
        for (int i = 1, j = 1; i < 10; ) {
            System.out.printf("%d*%d=%d\t", j, i, i * j);
            j++;
            if (j > i) {
                j = 1;
                i++;
                System.out.println();
            }
        }
    }

    private static void extracted() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
