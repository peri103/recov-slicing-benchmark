import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList value: " + list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue");

        // More additional code
        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        delayedList.add(new DelayedElement(2000)); // 2 seconds delay
        delayedList.add(new DelayedElement(3000)); // 3 seconds delay

        for (DelayedElement e : delayedList) {
            queueManager.addElement(e);
        }

        while (!queueManager.isEmpty()) {
            DelayedElement e = queueManager.takeElement();
            System.out.println("Additional element taken from queue");
        }
    }
}