package reflect;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/18 15:38
 */

public class ArgsDemo {
    public static void main(String[] args) {
        test();
        test("a");
        test("a","b");
        test("a","b","c");
        test("a","b","c","D");
    }

    public static void test(String... arg){
        System.out.println(arg.length);
    }
}
