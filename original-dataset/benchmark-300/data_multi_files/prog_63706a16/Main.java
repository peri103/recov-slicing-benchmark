import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional complex code
        List<DelayedElement> elementsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elementsList.add(new DelayedElement((i + 1) * 1000));
        }
        for (DelayedElement e : elementsList) {
            queueManager.addElement(e);
        }

        // Simulate some processing
        Thread.sleep(500);

        // Take elements from the queue
        for (int i = 0; i < elementsList.size(); i++) {
            DelayedElement taken = queueManager.takeElement();
            System.out.println("Taken: " + taken);
        }

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Main taken element: " + takenElement);

        // More unrelated code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}