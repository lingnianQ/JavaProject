package file;

import java.io.File;
import java.io.IOException;

/**
 * create 创建一个新文件
 */
public class CreateFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("");
        String path = file.getCanonicalPath();
        System.out.println(path);
        File file1 = new File("./stage02/src/file/1.txt");
        if (file1.exists()) {
            System.out.println("文件已存在！！");
        } else {
            file1.createNewFile();
        }
    }
}
