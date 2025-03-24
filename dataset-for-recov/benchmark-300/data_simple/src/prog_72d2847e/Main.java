import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long triggerTime;
    private int value;

    public DelayedElement(int value, long delayInMillis) {
        this.value = value;
        this.triggerTime = System.currentTimeMillis() + delayInMillis;
    }

    public int getValue() {
        return value;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(triggerTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(this.triggerTime, ((DelayedElement) other).triggerTime);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(42, 1000); // Delay of 1 second
        /* write */ queue.put(element);
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println(takenElement.getValue());
    }
}