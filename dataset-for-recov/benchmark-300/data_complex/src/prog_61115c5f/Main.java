import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(long delay, String data) {
        this.startTime = System.currentTimeMillis() + delay;
        this.data = data;
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

    public String getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<String> messages = new ArrayList<>();
        messages.add("First message");
        messages.add("Second message");
        messages.add("Third message");

        /* write */ queue.put(new DelayedElement(1000, "Hello, World!"));

        for (String msg : messages) {
            System.out.println(msg);
        }

        List<DelayedElement> delayedElements = new ArrayList<>();
        delayedElements.add(new DelayedElement(2000, "Delayed message 1"));
        delayedElements.add(new DelayedElement(3000, "Delayed message 2"));

        for (DelayedElement elem : delayedElements) {
            queue.put(elem);
        }

        /* read */ DelayedElement element = queue.take();
        System.out.println(element.getData());

        for (int i = 0; i < delayedElements.size(); i++) {
            DelayedElement e = queue.take();
            System.out.println("Processed: " + e.getData());
        }
    }
}