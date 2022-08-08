package homework.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 将整数1-100存入一个List集合中并输出
 * 之后将集合中40-60的元素翻转后并输出
 *
 * @author Xiloer
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        Collections.reverse(list.subList(39,60));
        System.out.println(list);
    }
}
