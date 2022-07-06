package day05;

/**
 * 数组演示
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //声明整型数组arr，包含10个元素，每个元素都是int型，默认值为0
        int[] arr = new int[10];
        //数组初始化
        int[] arr1 = new int[3];
        int[] arr2 = {2, 5, 8};
        int[] arr3 = new int[]{1, 4, 7};
        int[] arr4;
        arr4 = new int[]{3, 6, 9};
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        for (int i : arr4) {
            System.out.println(i);
        }
    }
}
