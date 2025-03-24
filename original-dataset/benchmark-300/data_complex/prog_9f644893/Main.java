import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
    public static void main(String[] args) throws Exception {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Write task
        Future<?> writeFuture = executor.submit(() -> {
            String testData = "Hello, DelayQueue!";
            /* write */ queue.put(new DelayedElement(1000, testData)); // Delay of 1 second
            System.out.println("Data written to queue: " + testData);
        });

        // Some unrelated computation
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 numbers: " + sum);

        // Read task
        Future<DelayedElement> readFuture = executor.submit(() -> {
            /* read */ DelayedElement element = queue.take();
            System.out.println("Data read from queue: " + element.getData());
            return element;
        });

        // Wait for both tasks to complete
        writeFuture.get();
        DelayedElement element = readFuture.get();
        System.out.println("Final read data: " + element.getData());

        executor.shutdown();
    }
}