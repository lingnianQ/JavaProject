package thread;

import lombok.Synchronized;

/**
 * static 静态方法上使用synchronized,那么该方法一定具有同步效果
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        /*
         *
         */
        Foo foo1 = new Foo();
        Boo boo = new Boo();
        Thread t1 = new Thread("foo1") {
            @Override
            public void run() {
                foo1.doSomething();
            }
        };
        Thread t2 = new Thread("foo2") {
            @Override
            public void run() {
                boo.doSomething();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo {
    public static void doSomething() {
        synchronized (Boo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ": 正在执行Boo.doSome方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println(t.getName() + ": Boo.doSome方法执行完毕...");
        }
    }
}

class Foo {
    public synchronized static void doSomething() {
//    @Synchronized
//    public static void doSomething() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + ": 正在执行Foo.doSome方法...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println(t.getName() + ": Foo.doSome方法执行完毕...");
    }
}