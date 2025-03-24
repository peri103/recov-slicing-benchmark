import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayMillis) {
        this.delayTime = delayMillis;
        this.startTime = System.currentTimeMillis() + delayMillis;
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
                "delayTime=" + delayTime +
                ", startTime=" + startTime +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay

        /* write */ queue.put(element);

        // Additional complex code
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }

        List<String> stringList = new ArrayList<>();
        for (Integer num : list) {
            stringList.add("Number: " + num);
        }

        for (String str : stringList) {
            System.out.println(str);
        }

        // Simulate some delay
        Thread.sleep(1500);

        /* read */ DelayedElement takenElement = queue.take();

        System.out.println("Element taken: " + takenElement);

        // More complex code
        List<DelayedElement> delayedElements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            delayedElements.add(new DelayedElement(2000 + i * 500));
        }

        for (DelayedElement delayedElement : delayedElements) {
            queue.put(delayedElement);
        }

        while (!queue.isEmpty()) {
            DelayedElement elem = queue.take();
            System.out.println("Processed: " + elem);
        }
    }
}