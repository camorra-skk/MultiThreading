package BasicThread.ThreadMethodsImpl;

public class ThreadJoin {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i=0;i<5;i++) {
                sleep(1000);
                System.out.println("Running " +i);
            }
        };

        Thread t = new Thread(runnable);
        t.setDaemon(true);
        t.start();

        try {
            t.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
