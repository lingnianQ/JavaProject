package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("qwe");
        list.add("zxc");
        list.add("asd");
        list.add("uio");
        list.add("add");
        for (int i = 0; i < list.size() / 2; i++) {
            String left = list.get(i);
            String right = list.get(list.size() - 1 - i);

            list.set(i, right);
            list.set(list.size() - 1 - i, left);
        }
        System.out.println("list: " + list);

        Collections.reverse(list);
        list.add(3,"lin");
        System.out.println("list: " + list);

        System.out.println(list.remove(3));
        System.out.println("list: " + list);

//        System.out.println(list.get(2));
//
//        System.out.println(list.set(2, "jkl"));
//
//        System.out.println("list: " + list);

    }
}
