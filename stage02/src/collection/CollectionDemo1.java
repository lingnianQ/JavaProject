package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合框架
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("123");
        c.add("456");
        c.add("789");
        c.add("741");
        c.add("963");
        System.out.println(c);

        int size = c.size();
        System.out.println(size);

        boolean isEmpty = c.isEmpty();
        System.out.println(isEmpty);

        c.clear();
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
}
