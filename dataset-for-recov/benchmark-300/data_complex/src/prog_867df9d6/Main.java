import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

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
        String valueToWrite = "Hello, DelayQueue!";
        /* write */ queue.put(new DelayedElement(1000, valueToWrite));

        // Additional complex code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        List<String> strings = new ArrayList<>();
        for (Integer num : numbers) {
            strings.add("Number: " + num);
        }

        for (String str : strings) {
            System.out.println(str);
        }

        // Simulating some delay
        Thread.sleep(1500);

        /* read */ DelayedElement element = queue.take();
        System.out.println(element.getData());

        // More complex code
        List<DelayedElement> delayedElements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            delayedElements.add(new DelayedElement(500 * i, "Delayed " + i));
        }

        for (DelayedElement delayed : delayedElements) {
            queue.put(delayed);
        }

        while (!queue.isEmpty()) {
            DelayedElement taken = queue.take();
            System.out.println("Taken: " + taken.getData());
        }
    }
}