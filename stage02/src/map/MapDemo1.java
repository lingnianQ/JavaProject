package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map 查找表
 * key -- value
 * qwe -- 1
 * zxc -- 2
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/12 15:38
 */

public class MapDemo1 {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> map = new TreeMap<>();
        map.put("语文", 99);
//        Integer value = map.put("语文", 89);
        Integer value = map.put("语文", null);
        map.put("数学", 100);
        map.put("英语", 101);
        map.put("物理", 110);
        Integer integer = map.putIfAbsent("语文", 60);
        map.put("化学", 111);
        System.out.println(value);
        System.out.println(integer);
        System.out.println(map);
        System.out.println(map.remove("语文"));
        System.out.println(map);
        System.out.println(map.size());
//        System.out.println(map.get("语文"));
//        System.out.println(map.containsKey("生物"));
//        System.out.println(map.containsValue(100));
//        map.clear();
        System.out.println(map.keySet());
//        map.values().clear();
        System.out.println("map: " + map);
//        Set<String> keySet = map.keySet();
//        keySet.clear();
//        map.replace("化学", 1000);
//        for (String k : keySet) {
//            System.out.println(k);
//        }

        //返回set视图
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            System.out.println(stringIntegerEntry);
        }
        System.out.println(map.values());
    }
}
