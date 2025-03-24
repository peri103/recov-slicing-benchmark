import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the DelayQueue
        DelayQueue<DelayedElement> queue = new DelayQueue<>();

        // Add some unrelated code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        System.out.println("Numbers list: " + numbers);

        // Perform the write operation
        /* write */ queue.put(new DelayedElement(2000)); // 2000 milliseconds delay

        // Add more unrelated code
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        System.out.println("Strings list: " + strings);

        // Perform some intermediate operations
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);

        // Perform the read operation
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken: " + element);

        // Add more unrelated code
        strings.forEach(System.out::println);
    }
}

class DelayedElement implements Delayed {
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