package ooday04;

public class Person {
    String name;
    int age;
    String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void sayHi() {
        System.out.println("Person{" +
                "name:" + name + " ," +
                "age:" + age + " ," +
                "address:" + address + "}");
    }
}
