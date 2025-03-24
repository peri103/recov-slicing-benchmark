import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 20);
        }

        queueManager.addElement(element);

        // Processing ArrayList elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Processing LinkedList elements
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken after delay: " + takenElement);

        // Additional processing
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(i * 30);
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println("New ArrayList element: " + list2.get(i));
        }
    }
}