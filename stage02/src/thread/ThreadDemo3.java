package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread--1");
            }
        });
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Thread--2");
                }
            }
        };
        t1.start();
        t2.start();

        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Runnable--1");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Runnable--2");
                }
            }
        };
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);
        t3.start();
        t4.start();
    }
}
