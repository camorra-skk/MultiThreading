package BasicThread.ThreadMethodsImpl;

import static java.lang.Thread.sleep;

public class ThreadsetDaemon {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running");
            }
        };

        Thread t = new Thread(runnable);
        t.setDaemon(true);
        t.start();
        try {
            sleep(3100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
