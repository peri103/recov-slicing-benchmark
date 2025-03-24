import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }
        System.out.println("List contents:");
        for (int value : list) {
            System.out.println(value);
        }

        // Simulate some other operations
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of list elements: " + sum);

        // More operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Finally, read from the queue
        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);
    }
}