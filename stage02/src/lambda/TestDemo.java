package lambda;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class TestDemo {
    public static void main(String[] args) {
        Arrays.stream(Objects.requireNonNull(new File("./stage02/src/file").listFiles(pathname -> pathname.getName().contains("o")))).map(File::getName).forEach(System.out::println);
    }
}
