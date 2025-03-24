import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the QueueManager
        QueueManager queueManager = new QueueManager();

        // Add some unrelated code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        System.out.println("List contents: " + list);

        // Write to the DelayQueue
        queueManager.addElement(1000); // 1 second delay

        // More unrelated code
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        for (String s : stringList) {
            System.out.println(s);
        }

        // Read from the DelayQueue
        int value = queueManager.takeElement();
        System.out.println("Element taken after delay: " + value);

        // Even more unrelated code
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);
    }
}