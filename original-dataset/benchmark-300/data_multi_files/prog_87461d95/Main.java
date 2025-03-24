import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        Processor processor = new Processor();

        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        List<DelayedElement> elementsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elementsList.add(new DelayedElement((i + 1) * 1000));
        }
        processor.addElements(elementsList);

        processor.processElements();

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Taken element: " + takenElement);

        System.out.println("Finalizing the program...");
    }
}