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
            list.add(i * 10);
        }
        System.out.println("List contents:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Simulate some processing time
        Thread.sleep(500);

        // More additional code
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("String list contents:");
        for (String s : stringList) {
            System.out.println(s);
        }

        // Simulate some more processing time
        Thread.sleep(500);

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken: " + takenElement.getDelay(TimeUnit.MILLISECONDS) + " ms");
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
}