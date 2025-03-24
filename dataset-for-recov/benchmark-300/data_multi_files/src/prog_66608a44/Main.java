import java.util.concurrent.DelayQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        manager.addElement(element);

        // Adding more complexity
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        anotherQueue.put(anotherElement);

        // Unrelated code
        System.out.println("Waiting for elements to be taken...");
        Thread.sleep(1500); // Sleep for 1.5 seconds

        /* read */ DelayedElement takenElement = manager.takeElement();
        System.out.println("Element taken from the queue");

        // More unrelated code
        DelayedElement takenAnotherElement = anotherQueue.take();
        System.out.println("Another element taken from the queue");
    }
}