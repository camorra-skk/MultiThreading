package BasicThreadCreation;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Inside Run Method");
        System.out.println("Completed Run Method");
    }
}

public class UsingThreadClass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Going Inside Thread");
        MyThread t1 = new MyThread();
        t1.start();
    }
}
