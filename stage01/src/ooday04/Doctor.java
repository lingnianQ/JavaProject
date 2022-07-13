package ooday04;

public class Doctor extends Person {
    String level;

    Doctor(String name, int age, String address, String level) {
        super(name, age, address);
        this.level = level;
    }

    void sayHi() {
        System.out.println("Doctor{" +
                "name:" + name + " ," +
                "age:" + age + " ," +
                "address:" + address + " ," +
                "level: " + level + "}");
    }
}
