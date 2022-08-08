package homework.day08;

import java.util.Arrays;

/**
 * 画内存图，分析程序运行结果
 *
 * @author Xiloer
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 1;
        String str = "hello";
        Point p = new Point(1, 2);
        String[] arr = {"one", "two", "three", str};
        int[] arr1 = {1, 2, 3, 4, a};
        Point[] arr2 = {new Point(1, 2), new Point(3, 4), new Point(5, 6), p};
        dosome(a, str, p, arr, arr1, arr2);
        System.out.println("a:" + a);//1
        System.out.println("str:" + str);//hello
        System.out.println("p:" + p);//(4,2)
        System.out.println("arr:" + Arrays.toString(arr));//[one,str,hello,hello]
        System.out.println("arr1:" + Arrays.toString(arr1));//[1,3,3,4,1]
        System.out.println("arr2:" + Arrays.toString(arr2));//[(1,2), (3,4), (12,6), (4,2)]
    }

    public static void dosome(int a, String str, Point p, String[] arr, int[] arr1, Point[] arr2) {
        arr1[a] = 3;
        arr[a] = "str";
        arr[a + 1] = str;
        str = "world";
        str = arr[2];
        str += "!!";
        p.setX(4);
        p = arr2[2];
        p.setX(6);
        arr2 = Arrays.copyOf(arr2, arr2.length - 1);
        arr2[2].setX(8);
        arr2 = new Point[]{new Point(2, 2), p};
        arr2[arr2.length - 1].setX(12);
    }
}
