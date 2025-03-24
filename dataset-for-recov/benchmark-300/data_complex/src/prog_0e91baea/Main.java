import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(String data, long delayInMillis) {
        this.data = data;
        this.startTime = System.currentTimeMillis() + delayInMillis;
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
        String valueToWrite = "TestValue";
        /* write */ queue.put(new DelayedElement(valueToWrite, 1000)); // Delay of 1 second

        // Additional complex code
        List<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");

        for (String item : list) {
            System.out.println(item);
        }

        // Wait for the element to be available
        Thread.sleep(1000);

        /* read */ DelayedElement element = queue.take();
        System.out.println(element.getData());

        // More complex code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}