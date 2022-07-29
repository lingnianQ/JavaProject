package file;

import java.io.File;
import java.io.IOException;

import static file.FileDemo.banner;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        banner();
        for (int i = 0; i < 10; i++) {
            File file = new File("stage02/src/resource/Test" + (i + 1) + ".txt");
            file.createNewFile();
//            file.delete();
        }
    }
}
