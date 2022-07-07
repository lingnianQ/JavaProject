package day06;

/**
 * method
 */
public class MethodDemo {
    public static void main(String[] args) {


        System.out.println(getDouble());
//        say();
//        say("ling");
//        say("lingNian", 22);
    }

    private static double getDouble() {
        return 8.88;
    }

    private static void say(String name, int age) {
        System.out.println(name + ":  HelloWorld!!  " + "age: " + age);
    }

    private static void say(String name) {

//        Scanner sc = new Scanner(System.in);
//        name = sc.nextLine();
        System.out.println(name + ":  HelloWorld!!");
    }

    private static void say() {
        System.out.println("helloWorld!!!!");
    }

}
