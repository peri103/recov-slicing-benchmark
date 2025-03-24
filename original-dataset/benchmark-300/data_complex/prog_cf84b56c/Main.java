import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("List contents: " + list);

        // Simulate some processing
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Processing element: " + list.get(i));
            Thread.sleep(100); // Simulate processing time
        }

        // Take the element from the queue after some processing
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken: " + takenElement);

        // More complex operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println("String: " + str);
        }

        // Simulate more processing
        for (int i = 0; i < 5; i++) {
            System.out.println("Additional processing step: " + i);
            Thread.sleep(200); // Simulate processing time
        }

        // Final output
        System.out.println("Program completed.");
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

        @Override
        public String toString() {
            return "DelayedElement{" +
                    "delayTime=" + delayTime +
                    ", startTime=" + startTime +
                    '}';
        }
    }
}