package thread;


/**
 * 有效的缩小同步范围可以在保证并发安全的前提下尽可能的提高并发效率.
 * 同步块:
 * synchronized(同步监视器对象){
 * 需要同步执行的代码片段
 * }
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Thread t1 = new Thread("Q.") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        Thread t2 = new Thread("H.") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}

class Shop {
    //    public synchronized void buy() {
    public void buy() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " :正在挑选衣服...");
            Thread.sleep(2000);
            /* 同步块使用时必须在synchronized()中指定同步器监视对象，该对象必须满足两点
             * 1.必须是引用对象类型
             * 2.多个线程看到的必须是同一个对象
             */
            synchronized (this) {
//            synchronized (new Object()) { //new 一定产生新对象，因此一定不能作为同步监视器使用
//                synchronized (t) {//---(t)  t表示当前执行代码的线程-- 不同线程t表示不同，因此不可以
                System.out.println(t.getName() + " :正在试衣服...");
                Thread.sleep(2000);
            }

            System.out.println(t.getName() + " :结账离开...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
