import java.util.concurrent.DelayQueue;
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
            list.add(i);
        }

        System.out.println("List before modification: " + list);
        list.replaceAll(x -> x * 2);
        System.out.println("List after modification: " + list);

        // Simulate some delay
        Thread.sleep(500);

        // More unrelated code
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("String List: " + stringList);

        // Simulate some more delay
        Thread.sleep(500);

        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue");
    }
}