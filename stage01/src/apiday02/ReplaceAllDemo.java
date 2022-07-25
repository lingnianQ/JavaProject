package apiday02;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "adc123def去你嘴456ghi78去你嘴";
        line = line.replaceAll("[去你嘴]+", "***");
        System.out.println(line);
    }
}
