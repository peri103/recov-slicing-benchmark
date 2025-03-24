import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        manager.addElement(1000);
        
        // Additional complex code
        for (int i = 0; i < 5; i++) {
            manager.addElement(2000 + i * 500);
        }
        
        System.out.println("Added multiple elements to the queue");
        
        // Simulate some processing time
        Thread.sleep(1500);
        
        // Take elements from the queue
        DelayQueue<DelayedElement> queue = manager.getQueue();
        while (!queue.isEmpty()) {
            DelayedElement element = queue.take();
            System.out.println("Element with delay " + (element.getDelay(TimeUnit.MILLISECONDS)) + "ms taken from queue");
        }
        
        // Final read
        /* read */ DelayedElement finalElement = queue.take();
        System.out.println("Final element taken from queue");
    }
}