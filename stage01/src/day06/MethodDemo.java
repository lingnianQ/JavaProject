package day06;

/**
 * method
 */
public class MethodDemo {
    public static void main(String[] args) {

        int[] arr = generateArray();
        ArrayToString(arr);
        /*
        System.out.println(plus(5, 6));
        System.out.println(getDouble());
        say();
        say("ling");
        say("lingNian", 22);
        */
    }

    private static int[] generateArray() {
//        生成数组- 容量- 10
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void ArrayToString(int[] arr) {
        //打印数组 - [,,,,]
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
            if (i != arr.length - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    private static int plus(int num1, int num2) {
        int num = num1 + num2;
        return num;
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
