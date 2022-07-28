package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件完成文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./stage02/src/io/1.jpg");
        FileOutputStream fos = new FileOutputStream("./stage02/src/io/2.jpg");
        long start = System.currentTimeMillis();

        int d;
        while ((d = fis.read()) != -1) {
            fos.write(d);
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
