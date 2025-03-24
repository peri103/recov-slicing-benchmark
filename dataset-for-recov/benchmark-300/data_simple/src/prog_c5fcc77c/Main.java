import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long startTime;
    private int value;

    public DelayedElement(long delay, int value) {
        this.startTime = System.currentTimeMillis() + delay;
        this.value = value;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.startTime, ((DelayedElement) o).startTime);
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        int valueToWrite = 42;
        /* write */ queue.put(new DelayedElement(1000, valueToWrite));
        /* read */ int valueRead = queue.take().getValue();
        System.out.println(valueRead);
    }
}