package collection;

import java.util.*;

public class ArraysToListDemo {
    public static void main(String[] args) {
        String[] array = {"qwe", "asd", "zxc", "uio", "uio"};
        System.out.println("array: " + Arrays.toString(array));

        List<String> list = Arrays.asList(array);
        System.out.println("list: " + list);

        array[1] = "six";
        System.out.println("list: " + list);
        System.out.println(Arrays.toString(args));
//         list.add("!!!!");
        // System.out.println("array: "+ Arrays.toString(array));

        //        ArrayList<String> list1 = new ArrayList<>();
//        list1.addAll(list);
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println("list1: " + list1);


        Set<String> list2 = new HashSet<>(list);
        System.out.println(list2);
    }
}
