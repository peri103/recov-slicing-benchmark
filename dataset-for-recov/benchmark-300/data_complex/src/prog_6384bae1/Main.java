import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        AtomicInteger counter = new AtomicInteger(0);

        // Simulate some unrelated operations
        for (int i = 0; i < 5; i++) {
            counter.incrementAndGet();
            System.out.println("Counter value: " + counter.get());
        }

        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // More unrelated operations
        System.out.println("Waiting for the delay to expire...");
        Thread.sleep(1500); // Wait for the delay to expire

        // Simulate some more unrelated operations
        for (int i = 0; i < 3; i++) {
            counter.decrementAndGet();
            System.out.println("Counter value: " + counter.get());
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue");

        // Final unrelated operations
        System.out.println("Final counter value: " + counter.get());
    }

    static class DelayedElement implements Delayed {
        private final long delayTime;
        private final long startTime;

        public DelayedElement(long delayTime) {
            this.delayTime = delayTime;
            this.startTime = System.currentTimeMillis();
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
}