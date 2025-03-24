import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        manager.addElement(element);

        // Simulate some other operations
        for (int i = 0; i < 5; i++) {
            DelayedElement newElement = new DelayedElement((i + 1) * 1000);
            manager.addElement(newElement);
        }

        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue with delay: " + takenElement.getDelay(TimeUnit.MILLISECONDS));
    }
}