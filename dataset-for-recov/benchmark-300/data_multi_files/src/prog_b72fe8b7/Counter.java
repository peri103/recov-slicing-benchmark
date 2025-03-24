import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment(int value) {
        counter.addAndGet(value);
    }

    public int getValue() {
        return counter.get();
    }
}
