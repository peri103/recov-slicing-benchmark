import java.util.Random;

public class Producer {
    private QueueManager queueManager;

    public Producer(QueueManager queueManager) {
        this.queueManager = queueManager;
    }

    public void produce() throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            queueManager.putValue(num);
            System.out.println("Produced: " + num);
            Thread.sleep(200); // Simulate time taken to produce
        }
    }
}
