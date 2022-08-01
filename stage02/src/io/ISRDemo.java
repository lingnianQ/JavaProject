package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用转换流读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./stage02/src/io/ISRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        /*
            java.io.Reader中提供了读取字符的方法:
            int read()
            定义和字节流InputStream上读取一个字节的格式是一样的。但是功能不同！！！
            该方法是读取1个字符，因此返回的int值本质上是一个char。因为一个char实际
            只占用2个字节，因此返回的int值应当只有"低16位"有数据，高16位补0.
            因此该方法仍然使用int型-1来表达流读取到末尾了。
         */
        int d;
        while ((d = isr.read()) != -1) {
            char c = (char) d;
            System.out.print(c);
        }
        isr.close();
    }
}
