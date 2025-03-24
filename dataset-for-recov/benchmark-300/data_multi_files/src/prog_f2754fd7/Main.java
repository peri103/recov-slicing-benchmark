import java.util.concurrent.DelayQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        manager.addElement(element);

        // Additional code to make the program more complex
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        anotherQueue.put(anotherElement);

        // Simulate some other operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing operation " + i);
            Thread.sleep(500); // Simulate time-consuming operation
        }

        // Take elements from both queues
        /* read */ DelayedElement takenElement = manager.takeElement();
        System.out.println("Taken from main queue: " + takenElement);

        DelayedElement anotherTakenElement = anotherQueue.take();
        System.out.println("Taken from another queue: " + anotherTakenElement);

        // More unrelated code
        System.out.println("Program execution completed.");
    }
}