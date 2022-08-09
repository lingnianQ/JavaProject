package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("asd");
        list.add("memory");
        list.add("about");
        list.add("rty");
        System.out.println(list);
//        Collections.sort(list);
//        Collections.sort(list, ((o1, o2) -> o1.length() - o2.length()));
//        Collections.sort(list, (Comparator.comparingInt(String::length)));

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
