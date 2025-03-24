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
        for (Integer value : list) {
            System.out.println("ArrayList value: " + value);
        }

        // Processing LinkedList elements
        for (Integer value : linkedList) {
            System.out.println("LinkedList value: " + value);
        }

        // Simulating some delay
        Thread.sleep(1500);

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from the queue");
    }
}