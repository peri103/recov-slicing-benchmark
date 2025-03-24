import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(long delayInMillis, String data) {
        this.startTime = System.currentTimeMillis() + delayInMillis;
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
        DelayedElement element = new DelayedElement(1000, "Hello, World!");
        /* write */ queue.put(element);

        // Additional code to make the program more complex
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(500, "Another Element");
        anotherQueue.put(anotherElement);

        // Simulate some processing
        for (int i = 0; i < 5; i++) {
            System.out.println("Processing iteration: " + i);
            Thread.sleep(200);
        }

        // Take from the anotherQueue
        DelayedElement takenAnotherElement = anotherQueue.take();
        System.out.println("Taken from another queue: " + takenAnotherElement.getData());

        // More complex processing
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("Sum so far: " + sum);
            Thread.sleep(100);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken from main queue: " + takenElement.getData());

        // Final processing
        System.out.println("Final sum: " + sum);
    }
}