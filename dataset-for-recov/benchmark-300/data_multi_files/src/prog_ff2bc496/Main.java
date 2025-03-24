import java.util.concurrent.DelayQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000, "Test Data");

        manager.addElement(element);

        // Additional code to make the program more complex
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(2000, "Another Data");
        anotherQueue.put(anotherElement);

        // Simulate some processing
        for (int i = 0; i < 3; i++) {
            System.out.println("Processing...");
            Thread.sleep(500);
        }

        /* read */ DelayedElement takenElement = manager.takeElement();
        System.out.println(takenElement.getData());

        // More additional code
        DelayedElement yetAnotherElement = new DelayedElement(1500, "Yet Another Data");
        manager.addElement(yetAnotherElement);

        // Simulate more processing
        for (int i = 0; i < 2; i++) {
            System.out.println("More Processing...");
            Thread.sleep(500);
        }

        DelayedElement takenAnotherElement = anotherQueue.take();
        System.out.println(takenAnotherElement.getData());
    }
}