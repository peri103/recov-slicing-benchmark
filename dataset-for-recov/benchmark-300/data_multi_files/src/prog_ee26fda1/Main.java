import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        linkedList.add("First");
        linkedList.add("Second");

        // Creating a DelayedElement with a 1-second delay
        DelayedElement element = new DelayedElement(1000);
        queueManager.addElement(element);

        // Processing the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Processing the LinkedList
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Creating another DelayedElement with a 2-second delay
        DelayedElement anotherElement = new DelayedElement(2000);
        queueManager.addElement(anotherElement);

        // Taking the first element from the DelayQueue
        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue: " + takenElement);

        // Adding more elements to the ArrayList
        list.add(30);
        list.add(40);

        // Processing the ArrayList again
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated ArrayList element: " + list.get(i));
        }

        // Taking the second element from the DelayQueue
        DelayedElement anotherTakenElement = queueManager.takeElement();
        System.out.println("Another element taken from queue: " + anotherTakenElement);
    }
}