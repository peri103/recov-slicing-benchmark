import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000, "Test Data");
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        queueManager.addElement(element);

        list.add(element);
        linkedList.add(element);

        for (DelayedElement e : list) {
            System.out.println("List element: " + e.getData());
        }

        for (DelayedElement e : linkedList) {
            System.out.println("LinkedList element: " + e.getData());
        }

        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element: " + takenElement.getData());

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}