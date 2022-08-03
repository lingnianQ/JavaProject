package thread;

/**
 * 线程的优先级
 * 线程有10个优先级，1-10，1最低，10最高优先级，5默认
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("min--" + i);
            }
        });

        Thread max = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("max--" + i);
            }
        });

        Thread nor = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("nor--" + i);
            }
        });

        min.setPriority(Thread.MIN_PRIORITY);//最小优先级 1
        max.setPriority(Thread.MAX_PRIORITY);//最大优先级 10
//        nor.setPriority(Thread.NORM_PRIORITY);//正常优先级 5

        min.start();
        nor.start();
        max.start();

    }
}
