import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<String> messages = new ArrayList<>();
        messages.add("First message");
        messages.add("Second message");
        messages.add("Third message");

        /* write */ queue.put(new DelayedElement(1000, "Hello, World!"));

        for (String msg : messages) {
            System.out.println(msg);
        }

        List<DelayedElement> delayedElements = new ArrayList<>();
        delayedElements.add(new DelayedElement(2000, "Delayed message 1"));
        delayedElements.add(new DelayedElement(3000, "Delayed message 2"));

        for (DelayedElement elem : delayedElements) {
            queue.put(elem);
        }

        MessageProcessor processor = new MessageProcessor(queue);
        processor.processMessages();

        for (int i = 0; i < delayedElements.size(); i++) {
            processor.processMessages();
        }
    }
}