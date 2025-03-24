import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long triggerTime;
    private int value;

    public DelayedElement(int value, long delayInMillis) {
        this.value = value;
        this.triggerTime = System.currentTimeMillis() + delayInMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(triggerTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.triggerTime, ((DelayedElement) o).triggerTime);
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<DelayedElement> elements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            DelayedElement element = new DelayedElement(i * 10, 1000 * (i + 1));
            elements.add(element);
            queue.put(element);
        }

        /* write */ queue.put(new DelayedElement(42, 1000)); // 1 second delay

        for (DelayedElement e : elements) {
            System.out.println("Element with value " + e.getValue() + " will be ready in " + e.getDelay(TimeUnit.SECONDS) + " seconds.");
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element value: " + takenElement.getValue());

        for (int i = 0; i < elements.size(); i++) {
            DelayedElement e = queue.take();
            System.out.println("Processed element value: " + e.getValue());
        }
    }
}