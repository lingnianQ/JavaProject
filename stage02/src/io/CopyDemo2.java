package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件完成文件的复制操作
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./stage02/src/io/1.pdf");
        FileOutputStream fos = new FileOutputStream("./stage02/src/io/2.pdf");
        long start = System.currentTimeMillis();

        byte[] data = new byte[1024 * 10];
        int len;
        while ((len = fis.read(data)) != -1) {
            fos.write(data, 0, len);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
        /*
         * 关闭流
         */
        fis.close();
        fos.close();
    }
}
