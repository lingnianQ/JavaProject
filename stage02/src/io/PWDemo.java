package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("./stage02/src/io/pw.txt");
        pw.println("确实");
        pw.println("想啸");
        System.out.println("写出完毕");
        pw.close();
    }
}
