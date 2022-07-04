package day03;

/**
 * if
 */
public class IfDemo {
    public static void main(String[] args) {
        double price = 500.0;
        if (price >= 500) {
            price = price * 0.8;
        }
        System.out.println("最终结算金额为：" + price);

        int num = 5;
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
        System.out.println("继续执行......");

        int[] arr = {1, 2, 3};
        for (int i : arr) {
            System.out.println(arr[i - 1]);
        }
    }
}
