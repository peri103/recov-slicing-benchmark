import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        for (int i = 0; i < 5; i++) {
            DelayedElement element = new DelayedElement(1000 * (i + 1));
            list.add(element);
            linkedList.add(element);
        }

        queueManager.addElement(new DelayedElement(1000)); // 1 second delay

        // Processing elements in the list
        for (DelayedElement e : list) {
            System.out.println("Processing element with delay: " + e.getDelay(TimeUnit.MILLISECONDS));
        }

        // Processing elements in the linkedList
        for (DelayedElement e : linkedList) {
            System.out.println("Processing linked list element with delay: " + e.getDelay(TimeUnit.MILLISECONDS));
        }

        /* read */ DelayedElement element = queueManager.takeElement();
        System.out.println("Element taken from the queue");

        // Additional processing
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i * 10);
        }

        for (int i : intList) {
            System.out.println("Integer value: " + i);
        }
    }
}