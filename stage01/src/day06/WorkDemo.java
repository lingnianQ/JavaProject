package day06;

import java.util.Arrays;

/**
 * 定义一个方法generate()
 * - 根据第一个参数生成指定长度的int数组；
 * - 根据第二个范围参数随机生成0到指定范围的随机数，填充到数组元素中，并将该数组返回；
 * - 输出倒序
 */
public class WorkDemo {
    public static void main(String[] args) {
        System.out.println("MaxOfArray:");
        int[] arr1 = generate(10, 100);
        System.out.println(Arrays.toString(MaxOfArray(arr1)));

        System.out.println("sortReverse:");
        int[] arr2 = generate(10, 100);
        sortReverseToString(arr2);

        System.out.println("generateArray:");
        System.out.println(Arrays.toString(generate(10, 100)));
    }

    private static void sortReverseToString(int[] arr) {
        Arrays.sort(arr);
        System.out.printf("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    private static int[] MaxOfArray(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = max;
        return arr;
    }

    private static int[] generate(int length, int m) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (m + 1));
        }
        return arr;
    }
}
