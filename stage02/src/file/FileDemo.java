package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 1.访问其表示的文件或目录的属性
 * 2.创建删除文件或空目录
 * 3.访问一个一个目录的子项
 * File 不可以：
 * 访问文件数据
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./stage02/src/file/banner.txt");

        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
