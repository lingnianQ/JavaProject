package file;

import java.io.File;

/**
 * 实际开发 使用mkdirs
 */
public class MkDirDemo {
    public static void main(String[] args) {
        File dir = new File("./stage02/src/file/Test/a/b");
        if (dir.exists()) {

            System.out.println("该目录已存在");
        }else {
//            dir.mkdir();
            dir.mkdirs();
            System.out.println("该目录已创建！");
        }
    }
}
