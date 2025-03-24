import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(element);
        linkedList.add(element);

        queueManager.addElement(element);

        // Simulating some other operations
        for (int i = 0; i < 5; i++) {
            DelayedElement newElement = new DelayedElement(1000 * (i + 1));
            queueManager.addElement(newElement);
            list.add(newElement);
            linkedList.add(newElement);
        }

        // Processing elements from the LinkedList
        for (DelayedElement e : linkedList) {
            System.out.println("Processing: " + e);
        }

        /* read */ DelayedElement takenElement = queueManager.getQueue().take();
        System.out.println("Taken Element: " + takenElement);

        // Additional operations on the ArrayList
        for (DelayedElement e : list) {
            System.out.println("List Element: " + e);
        }
    }
}