package reflect;

public class Person {
    private String name = "宋子琪";
    private int age = 22;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println(name + "说:hello!");
    }

    public void watchTV() {
        System.out.println(name + ":正在看电视");
    }

    public void sing() {
        System.out.println(name + ":正在唱歌");
    }

    public void playGame() {
        System.out.println(name + ":正在打游戏");
    }

    public void say(String info) {
        System.out.println(name + "说" + info);
    }

    public void say(String info, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(name + i + "次" + "说" + info);
        }
    }

    private void test() {
        System.out.println("test!!!!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
