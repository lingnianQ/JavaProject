package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class NewForDemo {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five"};
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(arr));


        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        for (Object o : c) {
            System.out.print(o);
        }
    }
}
