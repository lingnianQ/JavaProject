package ooday04;

/**
 * 重写Demo
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 向上造型
         */
        Person[] people = new Person[5];

        Person[] p = {new Student("狐臭张嘉文", 18, "西湖", "198111545130"),
                new Teacher("qaz", 36, "南京", 2000.0),
                new Doctor("uio", 48, "北京", "小医师"),
                new Doctor("uio", 48, "北京", "小医师"),
                new Doctor("uio", 48, "北京", "小医师")
        };
        for (Person person : p) {
            person.sayHi();
        }

        Person[] p1 = new Student[2];
        Person[] p2 = new Teacher[2];
        Person[] p3 = new Doctor[2];

        /**
         * testDemo
         */
        Student[] stu = new Student[]{
                new Student("qwe", 18, "西湖", "198111545128"),
                new Student("asd", 18, "西湖", "198111545129"),
                new Student("zxc", 18, "西湖", "198111545130")
        };
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].name);
            stu[i].sayHi();
        }

        Teacher[] tes = new Teacher[3];
        tes[0] = new Teacher("rty", 36, "南京", 1000.0);
        tes[1] = new Teacher("qaz", 36, "南京", 2000.0);
        tes[2] = new Teacher("wsx", 36, "南京", 4000.0);
        for (int i = 0; i < tes.length; i++) {
            System.out.println(tes[i].name);
            tes[i].sayHi();
        }

        Doctor[] docs = new Doctor[2];
        docs[0] = new Doctor("rfv", 48, "北京", "大医师");
        docs[1] = new Doctor("uio", 48, "北京", "小医师");
        for (int i = 0; i < docs.length; i++) {
            System.out.println(docs[i].name);
            tes[i].sayHi();
        }
    }
}
