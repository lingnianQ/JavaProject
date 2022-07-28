package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件输入流，用于从文件中读取字节数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        //读取fos.dat
        FileInputStream fis = new FileInputStream("./stage02/src/io/fos.dat");
        /* 第一次读取
         * fis.read() 读取文件第一个字节，放入int值二进制第八位
         *  11111111 00000011
         *  ^^^^^^^^
         */
        int d = fis.read();
        System.out.println(d);
        /* 第二次读取
         * fis.read() 读取文件第一个字节，放入int值二进制第八位
         *  11111111 00000011
         *           ^^^^^^^^
         */
        d = fis.read();
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));
        /* 第三次读取
         * fis.read() 读取文件第一个字节，放入int值二进制第八位
         *  11111111 00000011
         *                    ^^^^^^^^
         * 返回-1
         */
        d = fis.read();
        System.out.println(d);
        fis.close();
    }
}
