import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        manager.addElement(element);

        // Additional code to make the program more complex
        List<DelayedElement> elements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elements.add(new DelayedElement((i + 1) * 1000));
        }
        for (DelayedElement e : elements) {
            manager.addElement(e);
        }

        // Simulate some processing
        for (int i = 0; i < 3; i++) {
            System.out.println("Processing other tasks...");
            Thread.sleep(500);
        }

        /* read */ DelayedElement takenElement = manager.takeElement();
        System.out.println("Taken element: " + takenElement);

        // More additional code
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("Remaining element: " + manager.takeElement());
        }
    }
}