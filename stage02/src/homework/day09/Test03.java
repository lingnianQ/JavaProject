package homework.day09;

import java.util.*;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 *
 * @author Xiloer
 */
public class Test03 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while(set.size() != 10) {
            int num = random.nextInt(101);
//            int num = (int)(Math.random() * 101.0D);
            set.add(num);
        }

        System.out.println(set);
    }
}
