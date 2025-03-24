import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional complex code
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        System.out.println("List contents:");
        for (int value : list) {
            System.out.println(value);
        }

        // Simulate some processing
        Thread.sleep(500);

        // More complex code
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("From");
        stringList.add("Java");

        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Simulate more processing
        Thread.sleep(500);

        DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken after delay: " + takenElement.getDelay(TimeUnit.MILLISECONDS) + " ms");
    }
}