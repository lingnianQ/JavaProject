package exception;

/**
 * 1.final,finally,finalize
 * finalize是一个方法，定义在object 中，该方法为一个对象生命周期中的最后一个方法，
 * 会被GC调用，当一个对象即将被GC回收前是调用该方法
 */
public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(test("0"));
        System.out.println(test(null));
        System.out.println(test(""));
    }

    public static int test(String str) {
        try {
            return str.charAt(0) - '0';
        } catch (NullPointerException e) {
            return 1;
        } catch (Exception e) {
            return 2;
//        } finally {
//            return 3;
        }
    }
}
