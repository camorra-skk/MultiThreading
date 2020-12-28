package BasicThread.BasicThreadCreation;

class myRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Inside Run Method");
        System.out.println("Completed Run Method");
    }
}

public class UsingRunnableInterface {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Going Inside Thread");
        Thread t1 = new Thread(new myRunnable());
        t1.start();
    }
}
