import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("Generated numbers: " + numbers);

        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort(Integer::compareTo);

        System.out.println("Sorted numbers: " + sortedNumbers);

        int sum = sortedNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of sorted numbers: " + sum);

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);

        // More additional code
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        words.stream()
             .filter(word -> word.startsWith("b"))
             .forEach(System.out::println);
    }
}

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayInMillis) {
        this.delayTime = delayInMillis;
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