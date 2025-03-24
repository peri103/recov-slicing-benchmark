import java.util.concurrent.DelayQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        manager.addElement("Hello, World!", 1000); // Delay of 1 second

        // Additional complex code
        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement element = queue.take();
        System.out.println(element.getData());

        // Further processing
        while (!queue.isEmpty()) {
            DelayedElement nextElement = queue.take();
            System.out.println("Next Element: " + nextElement.getData());
        }
    }
}