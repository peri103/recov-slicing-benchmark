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

        System.out.println("List contents:");
        for (int num : list) {
            System.out.println(num);
        }

        // Simulate some processing time
        Thread.sleep(500);

        // More complex operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Finally, read from the queue
        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue");
    }
}