import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long startTime;

    public DelayedElement(long delayInMillis) {
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

    @Override
    public String toString() {
        return "DelayedElement";
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<Integer> list = new ArrayList<>();
        /* write */ queue.put(new DelayedElement(1000)); // Delay of 1 second

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken: " + element);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println("String list element: " + str);
        }
    }
}