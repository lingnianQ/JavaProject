package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        String name = t.getName(); //获取线程名
        System.out.println("name: " + name);

        long id = t.getId(); //获取唯一标识
        System.out.println("id: " + id);

        int priority = t.getPriority();//获取线程优先级，1-10，默认5
        System.out.println("priority: " + priority);

        boolean alive = t.isAlive();//线程是否活着
        boolean daemon = t.isDaemon();//线程是否为守护线程
        boolean interrupted = t.isInterrupted();//线程是否被中断了
        System.out.println(alive);
        System.out.println(daemon);
        System.out.println(interrupted);
    }
}
