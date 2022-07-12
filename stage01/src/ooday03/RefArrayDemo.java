package ooday03;

public class RefArrayDemo {
    public static void main(String[] args) {
        Student[] stu = new Student[3];
                //stu --- 局部变量-装入栈中--地址
                     // new Student[3]; --- new 出来的对象(包括成员变量)--装入堆中
        stu[0] = new Student();
        stu[1] = new Student();
        stu[0].name = "张三";
        stu[0].age = 18;
        stu[0].address = "西湖";
        System.out.println(stu[0].name);
        System.out.println(stu[1]);
//        System.out.println(stu[2].name);   //NullPointerException
    }
}
