package day05;

import java.util.Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }

        int max = -1;
        int min = 100;

        for (int j : arr) {
            max = Math.max(j, max);
            min = Math.min(j, min);
        }
        System.out.println("最大值：" + max);

        System.out.println("最小值：" + min);

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = max;


        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.print("]");
    }
}
