import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Simulate some processing time
        Thread.sleep(500);

        // More complex operations
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add("String " + i);
        }

        System.out.println("Strings list:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Simulate more processing time
        Thread.sleep(500);

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue: " + takenElement);

        // Final complex operations
        List<DelayedElement> elements = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            elements.add(new DelayedElement(2000)); // 2 seconds delay
        }

        System.out.println("Elements list:");
        for (DelayedElement elem : elements) {
            System.out.println(elem);
        }
    }
}