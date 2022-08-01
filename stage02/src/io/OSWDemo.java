package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * java IO将流按照读写数据的单位划分为字节与字符流
 * java.io.InputStream和OutputStream是所有字节流的超类，是抽象类。
 * java.io.Reader和Writer则是所有字符流的超类，是抽象类。
 * 字节流与字符流的超类互相不存在继承关系，是平级的。
 * <p>
 * Reader中定义了几个read方法，规定所有字符流都必须具备的读取字符的方法
 * Writer中定义了几个write方法，规定了所有字符流都必须具备的写出字符的方法
 * <p>
 * <p>
 * 转换流
 * java.io.InputStreamReader和OutputStreamWriter
 * 实际开发中当我们进行流连接对文本数据读写时，这几乎是一套必不可少的高级流。但是在
 * 流连接中我们不会直接操作这两个流。
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./stage02/src/io/osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        String line = "确实";
        osw.write(line);
        osw.write("我想啸   --- \n一个字！！");
        System.out.println("写出完毕!!");
        osw.close();
    }
}
