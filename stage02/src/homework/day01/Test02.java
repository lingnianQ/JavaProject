package homework.day01;


import java.io.File;

/**
 * 列出当前目录中所有名字包含s的子项。
 * <p>
 * 使用匿名内部类和lambda两种写法
 * <p>
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 *
 * @author Xiloer
 */
public class Test02 {
    public static void main(String[] args) {
        File dir = new File("./stage02/src/homework/day01");
        File[] subs = dir.listFiles((pathname -> pathname.getName().contains("s")));
        assert subs != null;
        for (File sub : subs) {
            System.out.println(sub.getName());
        }
    }
}
/*
	提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//【在这里标注该句代码意义】
	File dir = new File(".");

	//【在这里标注该句代码意义】
	File[] suns = dir.listFiles(new FileFilter() {
		public boolean accept(File file) {

		}
	});

	//【在这里标注该句代码意义】
	if(dir.isDirectory()){

	}

	//【在这里标注该句代码意义】
	System.out.println(subs[i].getName());

	//【在这里标注该句代码意义】
	return file.getName().contains("s");

	//【在这里标注该句代码意义】
	for(int i=0;i<subs.length;i++){

	}



 */