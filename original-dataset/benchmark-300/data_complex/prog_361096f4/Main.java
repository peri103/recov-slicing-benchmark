import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(long delay, String data) {
        this.startTime = System.currentTimeMillis() + delay;
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
        DelayedElement element = new DelayedElement(1000, "Test Data");
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        /* write */ queue.put(element);

        list.add(element);
        linkedList.add(element);

        for (DelayedElement e : list) {
            System.out.println("List element: " + e.getData());
        }

        for (DelayedElement e : linkedList) {
            System.out.println("LinkedList element: " + e.getData());
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element: " + takenElement.getData());

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}