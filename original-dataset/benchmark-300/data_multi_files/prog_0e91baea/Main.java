import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        String valueToWrite = "TestValue";
        queueManager.addToQueue(valueToWrite, 1000); // Delay of 1 second

        // Additional complex code
        List<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");

        for (String item : list) {
            System.out.println(item);
        }

        // Wait for the element to be available
        Thread.sleep(1000);

        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ DelayedElement element = queue.take();
        System.out.println(element.getData());

        // More complex code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}