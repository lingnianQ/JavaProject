package io;

import java.io.*;

/**
 * 对象流
 * 功能：对对象进行序列化与反序列化
 * 对象序列化由对象输出流完成：将一个java对象按照其结构转换为一组字节
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String name = "张嘉文";
        int age = 55;
        String gender = "男";
        String[] otherInfo = {"有狐臭", "吃红蓝", "喜欢叫"};
        Person person = new Person(name, age, gender, otherInfo);
        FileOutputStream fileOutputStream = new FileOutputStream("./stage02/src/io/person.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person);
        System.out.println("写出完毕");
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("./stage02/src/io/person.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }
}
