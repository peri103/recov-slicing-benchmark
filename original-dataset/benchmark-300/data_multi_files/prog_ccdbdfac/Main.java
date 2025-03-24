import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        queueManager.addElement(1000); // 1 second delay

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        /* read */ DelayedElement element = queueManager.takeElement();
        System.out.println("Element taken after delay: " + element);

        QueueManager anotherQueueManager = new QueueManager();
        anotherQueueManager.addElement(2000); // 2 seconds delay
        DelayedElement anotherElement = anotherQueueManager.takeElement();
        System.out.println("Another element taken after delay: " + anotherElement);
    }
}