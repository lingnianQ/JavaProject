package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo2 {
    public static void main(String[] args) {
        /*AutoCloseable*/
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("./stage02/src/exception/fos.dat");
        ) {
            fileOutputStream.write(1);
        } catch (IOException e) {
            System.out.println("出错了");
        }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./stage02/src/exception/fos.dat");
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
