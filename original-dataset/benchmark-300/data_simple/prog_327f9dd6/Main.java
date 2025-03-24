import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long startTime;
    private int value;

    public DelayedElement(int value, long delayInMillis) {
        this.value = value;
        this.startTime = System.currentTimeMillis() + delayInMillis;
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
        /* write */ queue.put(new DelayedElement(valueToWrite, 1000)); // Delay of 1 second
        /* read */ DelayedElement element = queue.take();
        int valueRead = element.getValue();
        System.out.println(valueRead);
    }
}