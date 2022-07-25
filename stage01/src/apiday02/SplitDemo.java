package apiday02;

import java.util.Arrays;

/**
 * 拆分正则表达式
 */
public class SplitDemo {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        String regex1 = "[你]";
        String str = "sytsnb@gmail.com你";
        System.out.println(Arrays.toString(str.split(regex)));
        System.out.println(Arrays.toString(str.split(regex1)));

        String regex2 = "[0-9]+";
        String str1 = "abc74878qwe789ghj7897";
        System.out.println(Arrays.toString(str1.split(regex2)));

        String s = "...123.........456.798.........";
        String[] data = s.split("\\.+");
        System.out.println(Arrays.toString(data));
    }
}