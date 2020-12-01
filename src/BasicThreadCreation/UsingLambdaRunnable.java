package BasicThreadCreation;

public class UsingLambdaRunnable {
    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            System.out.println("New Thread : " +Thread.currentThread().getName());
            System.out.println("Lambda Runnable Running");
            System.out.println("Lambda Runnable Completed");
        };

        System.out.println("Main Thread : " +Thread.currentThread().getName());
        Thread t1 = new Thread(myRunnable);
        t1.start();
    }
}
