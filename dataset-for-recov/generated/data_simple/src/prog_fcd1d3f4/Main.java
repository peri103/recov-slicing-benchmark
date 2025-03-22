import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        
        DelayedElement element = new DelayedElement("Hello, World!", 5000); // 5 seconds delay
        /* write */ queue.put(element);
        
        try {
            /* read */ DelayedElement retrievedElement = queue.take();
            System.out.println(retrievedElement.getData());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DelayedElement implements Delayed {
    private final String data;
    private final long startTime;

    public DelayedElement(String data, long delay) {
        this.data = data;
        this.startTime = System.currentTimeMillis() + delay;
    }

    public String getData() {
        return data;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayedElement) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedElement) o).startTime) {
            return 1;
        }
        return 0;
    }
}