package ooday04;

public class Student extends Person {
    String stuId;

    public Student(String name, int age, String address, String stuId) {
        super(name, age, address);
        this.stuId = stuId;
    }
}
