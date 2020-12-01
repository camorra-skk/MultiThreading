package BasicThreadCreation;

public class UsingAnnonymousRunnable {
    public static void main(String[] args) {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Inside Run Method");
                System.out.println("Completed Run Method");
            }
        };

        Thread t1 = new Thread(myRunnable);
        t1.start();
    }
}
