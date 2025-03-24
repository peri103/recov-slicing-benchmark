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

        // Additional complex code
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }

        List<DelayedElement> delayedElements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            delayedElements.add(new DelayedElement(i, 500 * (i + 1)));
        }

        for (DelayedElement e : delayedElements) {
            queue.put(e);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element value: " + takenElement.getValue());

        for (int i = 0; i < delayedElements.size(); i++) {
            DelayedElement e = queue.take();
            System.out.println("Additional element value: " + e.getValue());
        }
    }
}