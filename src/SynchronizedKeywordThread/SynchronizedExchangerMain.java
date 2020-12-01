package SynchronizedKeywordThread;

public class SynchronizedExchangerMain {
    public static void main(String[] args) {
        SynchronizedExchanger synchronizedExchanger = new SynchronizedExchanger();

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++) {
                            synchronizedExchanger.setObject("" + i);
                        }
                    }
                }
        );

        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++) {
                            System.out.println(synchronizedExchanger.getObject());
                        }
                    }
                }
        );

        t1.start();
        t2.start();
    }
}
