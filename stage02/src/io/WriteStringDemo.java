package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./stage02/src/io/fos.txt",true);//追加模式
//        FileOutputStream fos = new FileOutputStream("./stage02/src/io/fos.txt");

        String line = "确实想笑---";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        line = "123456789\n";

        data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);


        fos.close();
    }
}
