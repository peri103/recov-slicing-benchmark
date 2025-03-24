import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        System.out.println("List contents: " + list);

        QueueManager anotherQueueManager = new QueueManager();
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        anotherQueueManager.addElement(anotherElement);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("String list contents: " + stringList);

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken: " + takenElement);

        // More additional code
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element " + i + ": " + list.get(i));
        }

        DelayedElement takenAnotherElement = anotherQueueManager.takeElement();
        System.out.println("Another element taken: " + takenAnotherElement);
    }
}