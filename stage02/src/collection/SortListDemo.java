package collection;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (list.size() != 100) {
            int ran = random.nextInt(101);
            if (list.contains(ran)) {
                continue;
            }
            list.add(ran);
        }

        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
