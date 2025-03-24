import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<Integer> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        // Adding some elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding some strings to the stringList
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        // Printing the elements of the list
        System.out.println("List elements:");
        for (int i : list) {
            System.out.println(i);
        }

        // Printing the elements of the stringList
        System.out.println("String List elements:");
        for (String s : stringList) {
            System.out.println(s);
        }

        /* write */ queue.put(new DelayedElement(1000)); // 1000 milliseconds delay

        // Simulating some other operations
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("Sum of list elements: " + sum);

        // Concatenating strings from stringList
        StringBuilder concatenatedString = new StringBuilder();
        for (String s : stringList) {
            concatenatedString.append(s).append(" ");
        }
        System.out.println("Concatenated String: " + concatenatedString.toString().trim());

        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken after delay: " + element);

        // More operations
        List<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            doubleList.add(i * 1.5);
        }

        System.out.println("Double List elements:");
        for (double d : doubleList) {
            System.out.println(d);
        }
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
            long diff = startTime + delayTime - System.currentTimeMillis();
            return unit.convert(diff, TimeUnit.MILLISECONDS);
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