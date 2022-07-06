package com.tech.www;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        //        创建学生对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            //        主界面
            System.out.println("------欢迎来到学生管理系统------");
            System.out.printf("1.添加学生" +
                    "2.删除学生" +
                    "3.修改学生" +
                    "4.查看所有学生" +
                    "5.搜索学生信息" +
                    "6.退出" +
                    "请输入你的选择：");
            //用Scanner实现键盘录入
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            //用switch语句完成选择操作
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    findStudent(array);
                    break;
                case "6":
                    System.out.println("谢谢使用");
                    System.exit(0);//jvm退出。
            }
        }

    }

    private static void addStudent(ArrayList<Student> array) {
        //        创建录入学生对象的数据信息，显示提升信息，提升输入何种信息
        Scanner scanner = new Scanner(System.in);
        String sid;
//        为了让程序能够回到这里，我们使用循环实现
        while (true) {
            System.out.println("请输入学生学号：");
            sid = scanner.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("学号已经使用过，请从新输入：");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生成绩：");
        String score = scanner.nextLine();

//创建学生对象，把键盘录入的数据赋值个学生对象的成员变量
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setScore(score);
        array.add(student);
    }

    //    定义一个方法，判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private static void deleteStudent(ArrayList<Student> array) {
        //        这里录入要删除的学生信息。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的学生学号：");
        String sid = scanner.nextLine();
//        遍历集合后将对应的对象从集合中删除。
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {//比较
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入！");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }

    }

    private static void updateStudent(ArrayList<Student> array) {
        //        键盘录入要修改的学生学号
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要修改的学生学号：");
        String sid = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (!s.getSid().equals(sid)) {
                System.out.println("没有这个学生，输入错误");
                return;
            }
        }
//        键盘录入修改的信息
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生成绩：");
        String score = scanner.nextLine();
//        创建学生对象
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setScore(score);
//        遍历信息
        for (int i = 0; i < array.size(); i++) {
            Student student1 = array.get(i);
            if (student1.getSid().equals(sid)) {
                array.set(i, student);
                break;
            }
        }
        System.out.println("修改成功");

    }

    private static void findStudent(ArrayList<Student> array) {
    }

    private static void findAllStudent(ArrayList<Student> array) {
    }
}
