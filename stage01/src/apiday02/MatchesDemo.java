package apiday02;

/**
 * 邮箱正则表达式
 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email = "sytsnb@gmail.com";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        if (match) {
            System.out.println("邮箱格式正确！");
        } else {
            System.out.println("邮箱格式错误！");
        }
    }
}
