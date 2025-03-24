import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long startTime;
    private int value;

    public DelayedElement(int value, long delayInMillis) {
        this.value = value;
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

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        int valueToWrite = 42;
        /* write */ queue.put(new DelayedElement(valueToWrite, 1000)); // Delay of 1 second

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }

        System.out.println("Processing list:");
        for (int num : list) {
            System.out.println(num);
        }

        // Simulate some other operations
        try {
            Thread.sleep(500); // Simulate a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More complex operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        for (String str : stringList) {
            System.out.println(str);
        }

        // Finally, read the value from the queue
        /* read */ DelayedElement element = queue.take();
        int valueRead = element.getValue();
        System.out.println("Value read from queue: " + valueRead);
    }
}