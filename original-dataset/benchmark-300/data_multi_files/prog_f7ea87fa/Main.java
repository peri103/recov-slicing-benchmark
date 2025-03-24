import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(new DelayedElement(500, "First"));
        linkedList.add(new DelayedElement(1000, "Second"));

        // Adding elements from ArrayList to the DelayQueue
        for (DelayedElement element : list) {
            queueManager.addElement(element);
        }

        // Adding elements from LinkedList to the DelayQueue
        for (DelayedElement element : linkedList) {
            queueManager.addElement(element);
        }

        // Writing the main element to the DelayQueue
        queueManager.addElement(new DelayedElement(2000, "Main Element"));

        // Performing some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Printing numbers
        for (int number : numbers) {
            System.out.println(number);
        }

        // Reading the main element from the DelayQueue
        /* read */ DelayedElement mainElement = queueManager.getQueue().take();
        System.out.println(mainElement.getMessage());

        // Adding more elements to the DelayQueue
        queueManager.addElement(new DelayedElement(3000, "Third"));
        queueManager.addElement(new DelayedElement(4000, "Fourth"));

        // Reading another element from the DelayQueue
        DelayedElement anotherElement = queueManager.getQueue().take();
        System.out.println(anotherElement.getMessage());
    }
}