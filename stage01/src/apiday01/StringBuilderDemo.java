package apiday01;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("01234   ");
        sb.append("qwe123");
        sb.delete(1, 2);
        sb.replace(1, 2, "asd");
        sb.insert(1, "zxc");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        sb.reverse();
        System.out.println(sb);
    }
}
