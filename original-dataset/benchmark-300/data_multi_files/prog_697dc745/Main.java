import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Creating a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000);
        queueManager.addElement(element);

        // Iterating through the ArrayList and printing elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Iterating through the LinkedList and printing elements
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Taking the element from the DelayQueue
        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Taken element from DelayQueue: " + takenElement);

        // Adding more elements to the ArrayList
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Printing the updated ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated ArrayList element: " + list.get(i));
        }
    }
}