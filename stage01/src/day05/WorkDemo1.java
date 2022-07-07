package day05;

import java.util.Scanner;

/**
 * 学生管理
 * 菜单-添加学员，删除学员，修改学员，退出
 * 查询学生成绩，录入学生成绩，优秀，中等，差
 */
public class WorkDemo1 {
    public static void main(String[] args) {
        String[] name = new String[5];

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("学生管理系统：\n" +
                    "1.添加学员\n" +
                    "2.删除学员\n" +
                    "3.修改学员\n" +
                    "4.查看所有学员\n" +
                    "5.退出系统\n" +
                    "请选择菜单序号：\n");

            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    addStudent(name, sc);
                    break;
                case 2:
//                    int j = 0;
//                    String delName = sc.next();
//                    while (j < 5 || name[j] == null) {
//                        if (delName.equals(name[j])) {
//                            name[j] = null;
//                        }
//                        j++;
//                    }

                case 3:
//                    String changeName = sc.next();
//                    if (changeName.equals(name[0])) {
//                        name[0] = null;
//                    }
                case 4:
//                    for (int i = 0; i < name.length; i++) {
//                        System.out.println(name[i]);
//                    }
//                case 5:
//                    break;
            }
            if (menu == 5) {
                System.out.println("系统退出！！");
                return;
            }
        }
    }

    private static void addStudent(String[] name, Scanner sc) {
        //添加学员
        int i = 0;
        String addName = sc.next();
        name[i] = addName;
        i++;
        for (int j = 0; j < name.length; j++) {
            System.out.println(name[j]);
        }
    }
}
