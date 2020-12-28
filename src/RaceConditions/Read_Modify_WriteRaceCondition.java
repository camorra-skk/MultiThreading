package RaceConditions;

public class Read_Modify_WriteRaceCondition {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(getRunnable(counter,"Final from Thread 1 :"));
        Thread t2 = new Thread(getRunnable(counter,"Final from Thread 2 :"));

        t1.start();
        t2.start();
    }

    public static Runnable getRunnable(Counter counter, String message) {
        return () -> {
            for(int i=0;i<100000;i++) {
                counter.incAndGet();
            }
            System.out.println(message + counter.get());
        };
    }
}
