package file;

import java.io.File;
import java.io.FileFilter;

public class Test2 {
    public static void main(String[] args) {
        File dir = new File("./stage02/src/file");

        if (dir.isDirectory()) {

            FileFilter fileFilter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
//                    System.out.println("正在过滤" + pathname.getName());
                    return pathname.getName().startsWith("D");
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
