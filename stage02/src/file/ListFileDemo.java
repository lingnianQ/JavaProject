package file;

import java.io.File;

/**
 * 获取一个目录的所有子项
 */
public class ListFileDemo {
    public static void main(String[] args) {
        File dir = new File("./stage02");
        /**
         * isFile()--是否为文件
         * isDirectory()--是否为目录
         */
        if (dir.isDirectory()) {
            File[] subs = dir.listFiles();
            for (File sub : subs) {
                System.out.println(sub);
            }
            System.out.println(subs.length);
        }
    }
}
