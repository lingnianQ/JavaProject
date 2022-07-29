package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./stage02/src/io/bos.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String line = "确实";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        bufferedOutputStream.write(data);

        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
