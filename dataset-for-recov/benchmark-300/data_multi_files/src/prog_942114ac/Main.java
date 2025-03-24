import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringList.add("String " + i);
        }

        for (String str : stringList) {
            System.out.println(str);
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // More complex operations
        List<DelayedElement> delayedElements = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            delayedElements.add(new DelayedElement(2000 + i * 500));
        }

        for (DelayedElement delayedElement : delayedElements) {
            queueManager.addElement(delayedElement);
        }

        // Reading from the queue after some delay
        Thread.sleep(1500);
        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue: " + takenElement);

        // Further operations
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element at index " + i + ": " + list.get(i));
        }

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("String list element at index " + i + ": " + stringList.get(i));
        }
    }
}