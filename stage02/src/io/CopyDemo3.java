package io;

import java.io.*;

/**
 * 高级流--缓冲流
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("./stage02/src/io/1.pdf");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("./stage02/src/io/1.pdf");

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int d;
        while ((d = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(d);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();

        //        FileInputStream fis = new FileInputStream("./stage02/src/io/1.pdf");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//        FileOutputStream fos = new FileOutputStream("./stage02/src/io/3.pdf");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//        int d;
//        long start = System.currentTimeMillis();
//        while ((d = bis.read()) != -1) {
//            bos.write(d);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//        bis.close();
//        bos.close();
    }
}
