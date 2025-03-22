import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.PriorityQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        // Create a DelayQueue instance
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement("Hello, World!", 1000);

        // Create another DelayedElement with a delay of 2 seconds
        DelayedElement anotherElement = new DelayedElement("Goodbye, World!", 2000);

        // Write the element to the DelayQueue
        /* write */ delayQueue.put(element);

        // Add another element to the DelayQueue
        delayQueue.put(anotherElement);

        // Create a PriorityQueue for additional complexity
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        // Utilize an ExecutorService to run tasks concurrently
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                // Simulate some work
                Thread.sleep(500);
                System.out.println("Task 1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                // Simulate some work
                Thread.sleep(300);
                System.out.println("Task 2 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();

        try {
            // Read the element from the DelayQueue
            /* read */ DelayedElement readElement = delayQueue.take();

            // Print the value of the read element
            System.out.println("Read element: " + readElement.getValue());

            // Read another element from the DelayQueue
            DelayedElement anotherReadElement = delayQueue.take();
            System.out.println("Read another element: " + anotherReadElement.getValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Process the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            int value = priorityQueue.poll();
            System.out.println("PriorityQueue element: " + value);
        }
    }

    // Define a DelayedElement class that implements Delayed
    static class DelayedElement implements Delayed {
        private final String value;
        private final long startTime;

        public DelayedElement(String value, long delay) {
            this.value = value;
            this.startTime = System.currentTimeMillis() + delay;
        }

        public String getValue() {
            return value;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long delay = startTime - System.currentTimeMillis();
            return unit.convert(delay, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed other) {
            if (this.startTime < ((DelayedElement) other).startTime) {
                return -1;
            }
            if (this.startTime > ((DelayedElement) other).startTime) {
                return 1;
            }
            return 0;
        }
    }
}