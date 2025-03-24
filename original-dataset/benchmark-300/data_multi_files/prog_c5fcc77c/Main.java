import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
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

        // Writing a value to the DelayQueue
        queueManager.addToQueue(1000, 42);

        // Processing the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList value: " + list.get(i));
        }

        // Processing the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }

        // Reading the value from the DelayQueue
        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ int valueRead = queue.take().getValue();
        System.out.println("Value read from DelayQueue: " + valueRead);
    }
}