package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("java");
        c.add("html");
        c.add("php");
        c.add(".NET");
        c.add("c");
        c.add("#");
        c.add("#");
        c.add("c");

        Iterator it = c.iterator();
        while (it.hasNext()){
            String str = (String)it.next();
            if ("#".equals(str)){
//                c.remove("#");
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println(c);
    }
}
