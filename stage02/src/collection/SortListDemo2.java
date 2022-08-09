package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(45, 134));
        list.add(new Point(33, 321));
        list.add(new Point(11, 23));
        list.add(new Point(76, 90));
        System.out.println(list);
        Comparator<Point> c = new Comparator<Point>() {
            /**
             *
             * @param o1
             * @param o2
             * @return  >0 ,o1>o2 ;; <0 ,o1<o2 ;;=0,o1=o2
             */
            @Override
            public int compare(Point o1, Point o2) {
                return (o1.getX() * o1.getX() + o1.getY() * o1.getY())
                        - (o2.getX() * o2.getX() + o2.getY() * o2.getY());
            }
        };
//        Collections.sort(list, c);
        list.sort(c);
//        Collections.reverse(list);
        System.out.println(list);
    }
}
