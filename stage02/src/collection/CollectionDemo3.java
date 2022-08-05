package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Point p = new Point(1, 2);
        Point p1 = new Point(1, 2);
        c.add(p);
        c.add(p1);
        System.out.println(c);
        System.out.println(p);
        p.setX(2);
        System.out.println(c);
        System.out.println(p);
    }
}
