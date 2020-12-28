package RaceConditions;

public class Counter {
    private long counter = 0;

    public long incAndGet() {
        synchronized (this) {
            this.counter++;
            return this.counter;
        }
    }

    public long get() {
        return this.counter;
    }
}
