import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        int valueToWrite = 42;
        queueManager.writeToQueue(valueToWrite, 1000); // Delay of 1 second

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }

        System.out.println("Processing list:");
        for (int num : list) {
            System.out.println(num);
        }

        // Simulate some other operations
        try {
            Thread.sleep(500); // Simulate a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More complex operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        for (String str : stringList) {
            System.out.println(str);
        }

        // Finally, read the value from the queue
        int valueRead = queueManager.readFromQueue();
        System.out.println("Value read from queue: " + valueRead);
    }
}