import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Writing to the DelayQueue
        queueManager.addElement(new DelayedElement(1000, 42));

        // Processing the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Processing the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        // Reading from the DelayQueue
        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ DelayedElement element = queue.take();
        System.out.println("DelayedElement value: " + element.getValue());

        // Additional complex operations
        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            delayedList.add(new DelayedElement(2000, i * 100));
        }

        for (DelayedElement de : delayedList) {
            queueManager.addElement(de);
        }

        while (!queue.isEmpty()) {
            DelayedElement de = queue.take();
            System.out.println("Additional DelayedElement value: " + de.getValue());
        }
    }
}