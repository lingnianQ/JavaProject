package apiday02;

import java.util.Arrays;

public class SplitDemo1 {
    public static void main(String[] args) {
        String path = "http://localhost:8088/myweb/reg?name=zhangsan&pwd=123456&nick=san&age=16";
        String[] arr = path.split("\\?");
        System.out.println(arr[1]);
        String[] arr1 = arr[1].split("\\&");
        System.out.println(Arrays.toString(arr1));
        String[] data;
        for (int i = 0; i < arr1.length; i++) {
            data = arr1[i].split("=");
            System.out.println("参数名： " + data[0] + " ，参数值：" + data[1]);
        }
    }
}
