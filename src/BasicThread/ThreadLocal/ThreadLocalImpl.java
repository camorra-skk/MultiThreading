package BasicThread.ThreadLocal;

public class ThreadLocalImpl {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("BasicThread.ThreadLocal Set in Thread 1");
            threadLocal.set("Sumit");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            threadLocal.set("Kapoor");
            System.out.println("BasicThread.ThreadLocal Set in Thread 2");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
        });

        t1.start();
        t2.start();
    }
}
