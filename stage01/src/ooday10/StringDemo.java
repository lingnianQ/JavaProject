package ooday10;

public class StringDemo {

    public static void main(String[] args) {
        String str = "123asd是不是11";
        String str1 = "123asd是不是11";
        String str2 = "123asd是不是11";
        /**
         * 引用类型 == ，比较的是地址值是否相同--规定
         */
        System.out.println(str == str1);
        System.out.println(str2 == str1);
        System.out.println(str == str2);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
