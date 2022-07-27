package file;

import java.io.File;
import java.io.IOException;

public class DeleteFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("stage02/src/file/2.txt");
        if (!file.exists()){
            System.out.println("文件不存在");
            file.createNewFile();
        }else {
            file.delete();
            System.out.println("文件删除成功");
        }
    }
}
