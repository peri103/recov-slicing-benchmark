import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // Delay of 1 second

        // Initialize a list to store some additional data
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Print the numbers in the list
        System.out.println("Numbers in the list:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Write the element to the queue
        queueManager.addElement(element);

        // Simulate some other operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Read the element from the queue
        /* read */ DelayedElement takenElement = queueManager.takeElement();

        // Print the taken element
        System.out.println("Element taken from queue: " + takenElement);

        // Perform some more operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}