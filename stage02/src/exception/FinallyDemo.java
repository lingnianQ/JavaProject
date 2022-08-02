package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String s = null;
            System.out.println(s.length());
            return;
        } catch (Exception e) {
            System.out.println("出错了");
//            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("程序结束了");
    }
}
