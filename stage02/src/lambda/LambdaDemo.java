package lambda;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * lambda 表达式，简洁，面向函数式编程
 * 当需要实现的接口中，{只有一个抽象方法时}----才可以用 lambda
 * (参数列表) -> {
 * fun();
 * };
 */
public class LambdaDemo {
    public static void main(String[] args) {

//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().contains("t");
//            }
//        };
//
//        FileFilter fileFilter1 = (File pathname) -> {
//            return pathname.getName().endsWith("a");
//        };
//
//        FileFilter fileFilter2 = pathname -> pathname.getName().startsWith("D");

//        File dir = new File("./stage02/src/file");
//        File[] subs = dir.listFiles(pathname -> pathname.getName().contains("t"));
//        assert subs != null;
        for (File file : Objects.requireNonNull(new File("./stage02/src/file").listFiles(pathname -> pathname.getName().contains("t")))) {
            System.out.println(file.getName());
        }
    }
}
