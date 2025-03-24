import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional complex code
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            linkedList.add(i * 2);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList value: " + list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }

        // Simulate some processing time
        Thread.sleep(500);

        /* read */ DelayedElement takenElement = queueManager.getQueue().take();
        System.out.println("Element taken from queue: " + takenElement);

        // More complex code
        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        delayedList.add(new DelayedElement(2000));
        delayedList.add(new DelayedElement(3000));

        for (DelayedElement elem : delayedList) {
            queueManager.addElement(elem);
        }

        while (!queueManager.getQueue().isEmpty()) {
            DelayedElement elem = queueManager.getQueue().take();
            System.out.println("Processed delayed element: " + elem);
        }
    }
}