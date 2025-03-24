import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(42, 1000); // 1 second delay
        manager.addElement(element);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        for (int num : numbers) {
            System.out.println("Processing number: " + num);
        }

        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element value: " + takenElement.getValue());

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}