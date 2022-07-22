package apiday01;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * indexOf
         */
        String string4 = " in oup0  in";
        System.out.println(string4.indexOf("in"));
        //从下标为三的开始--10
        System.out.println(string4.indexOf("in", 3));
        /**
         * startsWith().--看是否以给定字符串 开始
         * endsWith().--看是否以给定字符串 结束
         */
        String string1 = "https://qwe123.png";
        String string2 = "qwe";
        String string3 = ".png";
        System.out.println(string1.startsWith(string2));
        System.out.println(string1.endsWith(string3));


        String s1 = "123abc";
        /**
         * length()---字符串长度
         */
        System.out.println(s1.length());

        /**
         * charAt()
         */
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();


        String s2 = "123" +
                "abc";
        System.out.println(s1 == s2);

        String s3 = "123";
        String s4 = s3 + "abc";
        System.out.println(s4 == s1);

        /**
         * equals.--- 比较值
         */
        String s5 = new String("hello");
        String s6 = "hello";
        System.out.println(s5.equals(s6));

        /**
         * trim--去除  两边空格
         */
        String str1 = "            hello world!     ";
        System.out.println(str1.trim());

        /**
         * toUppercase()---英文--转换为大写
         * toLowerCase(0---英文--转换为小写
         */
        String str2 = "Hello World!";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
    }
}
