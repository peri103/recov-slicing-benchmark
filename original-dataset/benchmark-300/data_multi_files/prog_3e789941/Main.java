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

        System.out.println("Processing ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        System.out.println("Processing LinkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        // Additional DelayQueue operations
        DelayedElement anotherElement = new DelayedElement(2000); // 2 second delay
        queueManager.addElement(anotherElement);

        // More complex operations
        ArrayList<DelayedElement> delayedElements = new ArrayList<>();
        delayedElements.add(new DelayedElement(3000));
        delayedElements.add(new DelayedElement(4000));

        for (DelayedElement e : delayedElements) {
            queueManager.addElement(e);
        }

        // Simulate some processing time
        Thread.sleep(1500);

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue with delay: " + takenElement.getDelay(TimeUnit.MILLISECONDS));

        // Final processing
        System.out.println("Remaining elements in queue: " + queueManager.takeElement().getDelay(TimeUnit.MILLISECONDS));
        while (true) {
            try {
                DelayedElement e = queueManager.takeElement();
                System.out.println("Processed element with delay: " + e.getDelay(TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}