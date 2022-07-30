package homework.day03;

import java.io.*;

/**
 * 设计一个类:User
 * 里面有四个属性:String name,String pwd,String nick,int age
 * 定义get,set方法以及toString方法和构造方法
 * <p>
 * 单词记一记:
 * pwd   是单词password的缩写，是密码的意思
 * user  用户
 * <p>
 * <p>
 * 当前程序启动后要求用户顺序输入以上四个信息
 * 然后实例化一个User对象保存着四个信息并将
 * 该对象序列化到文件中。
 * 文件名的命名规则:用户名.obj
 * 比如该用户输入用户名为张三，那么这个对象
 * 序列化后的文件名为:张三.obj
 *
 * @author Xiloer
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String name = "狐臭";
        String pwd = "qwe001";
        String nick = "确实想笑";
        int age = 20;

        User user = new User(name, pwd, nick, age);

        FileOutputStream fos = new FileOutputStream("./stage02/src/homework/day03/" + name + ".obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.close();

        FileInputStream fis = new FileInputStream("./stage02/src/homework/day03/" + name + ".obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        User user1 = (User) obj;
        System.out.println(user1);

        ois.close();

    }
}
