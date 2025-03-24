import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        manager.addElement(new DelayedElement(1000));
        System.out.println("Added element to the queue");
        for (int num : numbers) {
            System.out.println("Processing number: " + num);
        }
        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue");
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 5);
        }
        for (int num : numbers) {
            System.out.println("Updated number: " + num);
        }
    }
}