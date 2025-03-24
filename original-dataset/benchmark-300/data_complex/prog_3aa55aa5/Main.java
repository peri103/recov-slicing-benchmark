import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

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
        String data = "Hello, World!";
        /* write */ queue.put(new DelayedElement(data, 1000)); // Delay of 1 second

        // Additional complex code
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            DelayedElement element = new DelayedElement("Element " + i, 1000 + i * 500);
            list.add(element);
            linkedList.add(element);
        }

        for (DelayedElement element : list) {
            queue.put(element);
        }

        for (DelayedElement element : linkedList) {
            queue.put(element);
        }

        // More unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        /* read */ DelayedElement element = queue.take();
        System.out.println(element.getData());

        // Further processing
        while (!queue.isEmpty()) {
            DelayedElement nextElement = queue.take();
            System.out.println("Next Element: " + nextElement.getData());
        }
    }
}