package ooday02;

import java.util.LinkedList;

public class ConsDemo {
    public static void main(String[] args) {
        Student zs = new Student();
        zs.name = "张三";
        zs.age = 18;
        zs.address = "西湖";
        zs.sayHi();

        Student ls = new Student("李四", 19, "余杭");
        ls.sayHi();

//        this("---", 0, "南京");  this()
        Student stu = new Student();
        stu.sayHi();
        LinkedList list =new LinkedList<>();
    }
}
