import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

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

        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue with delay: " + takenElement.getDelay(TimeUnit.MILLISECONDS) + "ms");

        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        delayedList.add(new DelayedElement(2000));
        delayedList.add(new DelayedElement(3000));

        for (DelayedElement e : delayedList) {
            System.out.println("DelayedElement in list with delay: " + e.getDelay(TimeUnit.MILLISECONDS) + "ms");
        }
    }
}