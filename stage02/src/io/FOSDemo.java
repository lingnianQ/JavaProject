package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件流：
 * InputStream OutputStream
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./stage02/src/io/fos.dat");
        fos.write(-1);
        fos.write(3);
        System.out.println("写出完毕");
        fos.close();
    }
}
