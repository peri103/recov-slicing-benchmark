import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

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
        DelayedElement element = new DelayedElement(1000, "Test Data");

        /* write */ queue.put(element);

        // Additional code to make the program more complex
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(2000, "Another Data");
        anotherQueue.put(anotherElement);

        // Simulate some processing
        for (int i = 0; i < 3; i++) {
            System.out.println("Processing...");
            Thread.sleep(500);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println(takenElement.getData());

        // More additional code
        DelayedElement yetAnotherElement = new DelayedElement(1500, "Yet Another Data");
        queue.put(yetAnotherElement);

        // Simulate more processing
        for (int i = 0; i < 2; i++) {
            System.out.println("More Processing...");
            Thread.sleep(500);
        }

        DelayedElement takenAnotherElement = anotherQueue.take();
        System.out.println(takenAnotherElement.getData());
    }
}