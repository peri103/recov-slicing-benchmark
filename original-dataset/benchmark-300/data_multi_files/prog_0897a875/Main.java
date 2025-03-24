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

        System.out.println("Waiting for the first element to be taken...");

        /* read */ DelayedElement takenElement = manager.takeElement();

        System.out.println("Taken element: " + takenElement);

        // More unrelated code
        System.out.println("Waiting for the second element to be taken...");
        DelayedElement secondTakenElement = anotherQueue.take();
        System.out.println("Second taken element: " + secondTakenElement);

        // Even more unrelated code
        System.out.println("Creating a list of delayed elements...");
        DelayQueue<DelayedElement> listQueue = new DelayQueue<>();
        for (int i = 0; i < 5; i++) {
            listQueue.put(new DelayedElement(500 * (i + 1))); // 500ms, 1000ms, 1500ms, etc.
        }

        System.out.println("Taking elements from the list queue...");
        while (!listQueue.isEmpty()) {
            DelayedElement listElement = listQueue.take();
            System.out.println("List element taken: " + listElement);
        }
    }
}