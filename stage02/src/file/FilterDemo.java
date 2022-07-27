package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取src/file目录中所有名字中含有 ”t“的文件
 */
public class FilterDemo {
    public static void main(String[] args) {
        File dir = new File("./stage02/src/file");
        if (dir.isDirectory()) {
            /*
             * 过滤器
             */
            FileFilter fileFilter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
//                    return pathname.getName().indexOf(".java") > 0;
                    return pathname.getName().contains(".java");
                }
            };

            File[] subs = dir.listFiles(fileFilter);
            assert subs != null;
            for (File sub : subs) {
                System.out.println(sub.getName());
            }
        }
    }
}
