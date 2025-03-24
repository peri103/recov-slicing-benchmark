import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize QueueManager
        QueueManager queueManager = new QueueManager();

        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000); // 1 second delay

        // Add some unrelated code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Print the list
        System.out.println("List contents:");
        for (int value : list) {
            System.out.println(value);
        }

        // Write the element to the queue
        queueManager.addElement(element);

        // Add more unrelated code
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Print the string list
        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Read the element from the queue
        DelayedElement takenElement = queueManager.takeElement();

        // Print the taken element
        System.out.println("Element taken after delay: " + takenElement);

        // Add more unrelated code
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        System.out.println("Sum of list values: " + sum);
    }
}