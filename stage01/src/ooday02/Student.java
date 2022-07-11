package ooday02;

/**
 * 学生类
 * java: 成员变量和局部变量可以同名，使用时默认采取就近原则
 * 若想访问成员变量，使用 this-------this访问成员变量（成员变量与局部变量同名时）
 */
class Student {
    String name; //成员变量（整个类）
    int age;
    String address;

    Student() {
        this("---", 0, "南京");
    }

    Student(String name, int age, String address) {//局部变量（当前方法中）
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void sayHi() {
        System.out.println("name: " + name + " age: " + age + " address: " + address);
    }
}
