import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        list.add(new DelayedElement(500));
        linkedList.add(new DelayedElement(2000));

        // Writing to the queue
        queueManager.addElement(element);

        // Processing the list
        for (DelayedElement e : list) {
            queueManager.addElement(e);
        }

        // Processing the linkedList
        for (DelayedElement e : linkedList) {
            queueManager.addElement(e);
        }

        // Reading from the queue
        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue");

        // Additional operations
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList.add(i * 10);
        }

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String s : stringList) {
            System.out.println(s);
        }
    }
}