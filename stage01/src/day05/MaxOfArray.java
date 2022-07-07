package day05;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }

        int max = -1;
        int min = 100;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }
}
