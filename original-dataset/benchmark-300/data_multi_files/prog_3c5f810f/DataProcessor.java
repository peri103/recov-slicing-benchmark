import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class DataProcessor {
    private LinkedBlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
    private Random random = new Random();

    public void processStrings() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            stringQueue.put("String " + i);
        }

        for (int i = 0; i < 5; i++) {
            String str = stringQueue.take();
            System.out.println("Processed: " + str);
        }

        int randomNumber = random.nextInt(100);
        System.out.println("Random number generated: " + randomNumber);
    }
}
