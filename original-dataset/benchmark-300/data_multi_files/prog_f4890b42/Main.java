import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        manager.addElement(element);

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        System.out.println("List contents: " + list);

        // Simulate some processing time
        Thread.sleep(500);

        // Another QueueManager operation
        QueueManager anotherManager = new QueueManager();
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        anotherManager.addElement(anotherElement);

        // More processing
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Processing list item: " + list.get(i));
        }

        /* read */ DelayedElement takenElement = manager.getQueue().take();
        System.out.println("Element taken from queue with delay: " + takenElement.getDelay(TimeUnit.MILLISECONDS) + " ms");

        // Final processing
        DelayedElement anotherTakenElement = anotherManager.getQueue().take();
        System.out.println("Another element taken from queue with delay: " + anotherTakenElement.getDelay(TimeUnit.MILLISECONDS) + " ms");
    }
}