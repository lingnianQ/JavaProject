package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 记事本功能
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //向文件中按行写入文本数据
        //1.创建文件流(低级流，字节流): 向文件中写入字节数据，可修改为追加模式
        FileOutputStream fos = new FileOutputStream("./stage02/src/io/pw2.txt");
//        FileOutputStream fos = new FileOutputStream("./stage02/src/io/pw2.txt", true);
        //2.创建转换流(高级流，字符流)：衔接字节与字符流，负责将写出的字符转换成字节，可指定字符编码  --UTF_8
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //3.创建缓冲字符流（高级流，字符流）：块写文本数据加速
        BufferedWriter bw = new BufferedWriter(osw);
        //4.创建PrintWriter（高级流，字符流）：按行写出字符串，自动行刷新
        PrintWriter pw = new PrintWriter(bw);
        //
        Scanner scanner = new Scanner(System.in);
        String line = "";
        while (true) {
            line = scanner.nextLine();
            if (!line.equals("exit")) {
                pw.println(line);
                pw.flush();
            } else {
                //关闭 流
                pw.close();
                return;
            }
//        pw.println("嘻嘻");
//        pw.println("哈哈");
        }
    }
}
