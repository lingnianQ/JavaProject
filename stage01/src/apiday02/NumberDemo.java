package apiday02;

public class NumberDemo {
    public static void main(String[] args) {
        Integer integer = new Integer(5);
        Integer integer1 = new Integer(5);
        System.out.println(integer == integer1);
        System.out.println(integer.equals(integer1));

        //Integer.valueOf() ---复用  -128-127范围内数据---
        Integer integer2 = Integer.valueOf("500");
        Integer integer3 = Integer.valueOf("500");
        System.out.println(integer2 == integer3);

        Integer i = 5;
//        int j = i.intValue();
        int j = i;
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MAX_VALUE);

        String s1 = "123";
        int age = Integer.parseInt(s1);
        System.out.println(age);

        String s2 = "123.465";
        double price = Double.parseDouble(s2);
        System.out.println(price);
    }
}
