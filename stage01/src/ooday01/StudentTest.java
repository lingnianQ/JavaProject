package ooday01;

public class StudentTest {
    public static void main(String[] args) {
// 数据类型  引用类型变量 指向（=） 对象（new）
        Student stu = new Student();
        stu.name = "lingnian";
        stu.age = 18;
        stu.address = "蚌埠";
        stu.study();
        stu.sayHi();

        Student stu1 = new Student();
        stu1.study();
        stu1.sayHi();
    }
}
