package day06;

import java.util.Arrays;

/**
 * 数组的操作
 */
public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.println("排序前：");
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (i != arr.length - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.print(arr[i]);
        }
        System.out.println("]");

        //排序
        Arrays.sort(arr);

        //排序后
        System.out.println("排序后：");
        int count = 0;

        System.out.printf("[");
        for (int i : arr) {
            count++;
            if (count != arr.length)
                System.out.print(i + ",");
            else
                System.out.print(i);
        }
        System.out.printf("]");

        /*        int[] a = {10, 20, 30, 40, 50};
        int[] b = Arrays.copyOf(a, 6);
        for (int i : b) {
            System.out.println(i);
        }*/



        /*
        int[] a = {10, 20, 30, 40, 50};
        int[] b = new int[6];

        System.arraycopy(a, 1, b, 2, 3);
        for (int i : b) {
            System.out.println(i);
        }*/
    }
}
