package apiday02;

public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Person person1 = new Student();
        person = student;
    }
}

interface Inter {
    default void show() {

    }
}

class Person {
    private Integer a;
    private String b;

    Person() {

    }

    Person(int a, String b) {

    }
}

class Student extends Person {
    private Integer id;

    Student() {

    }

    Student(int a, String b, int id) {
        super(a, b);
        this.id = id;
    }
}