package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        //获取3-7
        List<Integer> subList = list.subList(3, 8);
        System.out.println(subList);

        //扩大子集10倍-------subList--对 原集合对应操作
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println(subList);
        System.out.println(list);

        //删除list 2-8
        list.subList(2,9).clear();
        System.out.println(list);
    }
}
