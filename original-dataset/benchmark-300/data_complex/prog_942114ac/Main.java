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

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringList.add("String " + i);
        }

        for (String str : stringList) {
            System.out.println(str);
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // More complex operations
        List<DelayedElement> delayedElements = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            delayedElements.add(new DelayedElement(2000 + i * 500));
        }

        for (DelayedElement delayedElement : delayedElements) {
            queue.put(delayedElement);
        }

        // Reading from the queue after some delay
        Thread.sleep(1500);
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);

        // Further operations
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element at index " + i + ": " + list.get(i));
        }

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("String list element at index " + i + ": " + stringList.get(i));
        }
    }
}

class DelayedElement implements Delayed {
    private long startTime;

    public DelayedElement(long delayInMilliseconds) {
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
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

    @Override
    public String toString() {
        return "DelayedElement{" +
                "startTime=" + startTime +
                '}';
    }
}