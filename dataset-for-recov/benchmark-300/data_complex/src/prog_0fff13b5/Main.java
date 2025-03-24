import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize DelayQueue and add a delayed element
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Initialize other data structures for complexity
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        list.add(10);
        list.add(20);
        linkedList.add("Hello");
        linkedList.add("World");

        // Perform some operations on the list and linked list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }
        for (String s : linkedList) {
            System.out.println("LinkedList value: " + s);
        }

        // Add more elements to the list
        list.add(30);
        list.add(40);

        // Simulate some delay
        Thread.sleep(500);

        // Perform additional operations
        linkedList.add("Complex");
        linkedList.add("Program");

        // Take the element from the DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);

        // Print the final state of the list and linked list
        System.out.println("Final list: " + list);
        System.out.println("Final linked list: " + linkedList);
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
            long remainingTime = delayTime - elapsedTime;
            return unit.convert(remainingTime, TimeUnit.MILLISECONDS);
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