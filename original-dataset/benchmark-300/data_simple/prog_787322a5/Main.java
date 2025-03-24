import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        /* write */ queue.put(new DelayedElement(1000)); // 1 second delay
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken after delay: " + element.getValue());
    }
}

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;
    private final int value;

    public DelayedElement(int delayInMillis) {
        this.delayTime = delayInMillis;
        this.startTime = System.currentTimeMillis();
        this.value = 42; // Example value
    }

    public int getValue() {
        return value;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long elapsedTime = System.currentTimeMillis() - startTime;
        return unit.convert(delayTime - elapsedTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }
}