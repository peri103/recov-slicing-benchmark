import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Create a DelayQueue instance
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement("Hello, World!", 1000);

        // Write the element to the DelayQueue
        /* write */ delayQueue.put(element);

        try {
            // Read the element from the DelayQueue
            /* read */ DelayedElement readElement = delayQueue.take();

            // Print the value of the read element
            System.out.println(readElement.getValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
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