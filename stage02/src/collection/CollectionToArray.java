package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        System.out.println(c);

        c.toArray();
        Object[] array = c.toArray();

        String[] toArray = c.toArray(new String[0]);
        System.out.println(Arrays.toString(toArray));
    }
}
