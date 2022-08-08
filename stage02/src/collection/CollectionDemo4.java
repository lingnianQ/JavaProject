package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add("C");
        c1.add(".NET");
        c1.add("java");

        c2.add("python");
        c2.add("PHP");
        System.out.println(c1);
        System.out.println(c2);
        c1.addAll(c2);
        System.out.println(c1);
        Collection c3 = new ArrayList();
        c3.add("C");
        c3.add("python");
        c3.add("css");

        boolean containsAll = c1.containsAll(c3);
        System.out.println(containsAll);

        //保留交集
        c1.retainAll(c3);
        System.out.println("c3" + c3);
        System.out.println("c1" + c1);

        //删除交集，--c1
        c1.removeAll(c3);
        System.out.println("c3" + c3);
        System.out.println("c1" + c1);

    }
}
