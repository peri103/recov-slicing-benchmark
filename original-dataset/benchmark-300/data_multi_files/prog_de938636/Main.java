import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        manager.addElement(element);

        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("Numbers in the list:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Simulate some processing time
        Thread.sleep(500);

        // Another unrelated operation
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        System.out.println("Strings in the list:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Simulate more processing time
        Thread.sleep(500);

        /* read */ DelayedElement takenElement = manager.takeElement();
        System.out.println("Element taken from the queue");
    }
}