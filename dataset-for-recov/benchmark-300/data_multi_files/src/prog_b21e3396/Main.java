import java.util.concurrent.DelayQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        Logger logger = new Logger();
        logger.log("Program started");
        
        /* write */ queue.put(new DelayedElement(1000, "Hello, World!"));
        logger.log("Element added to the queue");
        
        for (int i = 0; i < 5; i++) {
            logger.log("Processing step " + i);
            Thread.sleep(200);
        }
        
        /* read */ DelayedElement element = queue.take();
        logger.log("Element taken from the queue: " + element.getData());
        
        for (String entry : logger.getLog()) {
            System.out.println(entry);
        }
    }
}