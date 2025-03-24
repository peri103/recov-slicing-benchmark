import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(String data, long delayInMillis) {
        this.data = data;
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

    public String getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        String valueToWrite = "TestValue";
        /* write */ queue.put(new DelayedElement(valueToWrite, 1000)); // Delay of 1 second

        // Wait for the element to be available
        Thread.sleep(1000);

        /* read */ DelayedElement element = queue.take();
        System.out.println(element.getData());
    }
}