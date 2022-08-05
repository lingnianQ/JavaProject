package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Point> c = new ArrayList<Point>();
        c.add(new Point(1, 2));
        c.add(new Point(3, 4));
        c.add(new Point(5, 6));
        c.add(new Point(7, 8));

        System.out.println(c);

        System.out.println(c.contains(new Point(1, 2)));
        System.out.println(c.remove(new Point(1, 2)));
        System.out.println(c);
    }

}
