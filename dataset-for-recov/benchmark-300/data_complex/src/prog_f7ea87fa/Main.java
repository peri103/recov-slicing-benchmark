import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(new DelayedElement(500, "First"));
        linkedList.add(new DelayedElement(1000, "Second"));

        // Adding elements from ArrayList to the DelayQueue
        for (DelayedElement element : list) {
            queue.put(element);
        }

        // Adding elements from LinkedList to the DelayQueue
        for (DelayedElement element : linkedList) {
            queue.put(element);
        }

        // Writing the main element to the DelayQueue
        /* write */ queue.put(new DelayedElement(2000, "Main Element"));

        // Performing some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Printing numbers
        for (int number : numbers) {
            System.out.println(number);
        }

        // Reading the main element from the DelayQueue
        /* read */ DelayedElement mainElement = queue.take();
        System.out.println(mainElement.getMessage());

        // Adding more elements to the DelayQueue
        queue.put(new DelayedElement(3000, "Third"));
        queue.put(new DelayedElement(4000, "Fourth"));

        // Reading another element from the DelayQueue
        DelayedElement anotherElement = queue.take();
        System.out.println(anotherElement.getMessage());
    }
}

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long expireTime;
    private final String message;

    public DelayedElement(long delayTime, String message) {
        this.delayTime = delayTime;
        this.expireTime = System.currentTimeMillis() + delayTime;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(expireTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.expireTime, ((DelayedElement) o).expireTime);
    }
}