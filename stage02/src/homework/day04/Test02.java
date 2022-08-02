package homework.day04;
/**
 * 完成一个转码工具。
 * 比如当前项目目录下有一个文本文件note.txt，字符串编码
 * 是GBK的，现在需要将这个文件内容转换为UTF-8编码，并将其
 * 写出到文件note_utf.txt中。
 * 
 * 单词记一记：
 * note 笔记
 * 
 * 思路:
 * 用GBK编码将note.txt文件内容读取出来，再以UTF-8编码写入
 * 到note_utf.txt中
 * 
 * 要点:
 * 组建流连接时，输入流中的转换流指定为GBK编码。最终用缓冲
 * 输入流按行读取字符串。
 * 组件输出流中的转换流时指定为UTF-8编码，最终按行写出时
 * 就可以了。
 * 
 * 
 * 最终程序可以扩展为，读取的文件名可以让用户在控制台输入，
 * 该文件的字符集也可以指定。然后想转换为什么字符集也可以
 * 指定，并最终写入一个新文件。这样就可以随意使用了。
 * 
 * @author Xiloer
 *
 */
public class Test02 {
	
}
/*
    提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，

    //【在这里标注该句代码意义】
    while((line = br.readLine())!=null){

    }
    //【在这里标注该句代码意义】
    InputStreamReader isr = new InputStreamReader(fis,"GBK");

    //【在这里标注该句代码意义】
    OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

    //【在这里标注该句代码意义】
    BufferedReader br = new BufferedReader(isr);

    //【在这里标注该句代码意义】
    PrintWriter pw = new PrintWriter(bw);

    //【在这里标注该句代码意义】
    FileInputStream fis = new FileInputStream("note.txt");

    //【在这里标注该句代码意义】
    BufferedWriter bw = new BufferedWriter(osw);

    //【在这里标注该句代码意义】
    String line;

    //【在这里标注该句代码意义】
    pw.println(line);

    //【在这里标注该句代码意义】
    System.out.println("转码完毕!");
    br.close();
    pw.close();

    //【在这里标注该句代码意义】
    FileOutputStream fos = new FileOutputStream("note_utf.txt");
 */