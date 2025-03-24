import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        manager.addElement(new DelayedElement(1000));

        DelayQueue<DelayedElement> queue = manager.getQueue();
        while (!queue.isEmpty()) {
            /* read */ DelayedElement element = queue.take();
            System.out.println("Element taken from the queue with delay: " + element.getDelay(TimeUnit.MILLISECONDS));
        }
    }
}