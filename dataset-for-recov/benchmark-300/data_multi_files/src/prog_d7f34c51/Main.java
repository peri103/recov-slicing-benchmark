import java.util.concurrent.DelayQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        manager.addElement(1000); // 1 second delay

        // Additional complex code
        QueueManager anotherManager = new QueueManager();
        anotherManager.addElement(2000); // 2 seconds delay

        // Simulate some other operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing operation " + i);
            Thread.sleep(500); // Simulate some delay
        }

        // Take element from the second queue
        DelayQueue<DelayedElement> anotherQueue = anotherManager.getQueue();
        DelayedElement takenAnotherElement = anotherQueue.take();
        System.out.println("Element taken from the second queue");

        // Take element from the first queue
        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from the first queue");

        // More complex operations
        QueueManager thirdManager = new QueueManager();
        for (int i = 0; i < 3; i++) {
            thirdManager.addElement(500 * (i + 1)); // 0.5, 1, 1.5 seconds delay
        }

        DelayQueue<DelayedElement> thirdQueue = thirdManager.getQueue();
        while (!thirdQueue.isEmpty()) {
            DelayedElement e = thirdQueue.take();
            System.out.println("Element with delay " + e.getDelay(TimeUnit.MILLISECONDS) + " ms taken from the third queue");
        }
    }
}