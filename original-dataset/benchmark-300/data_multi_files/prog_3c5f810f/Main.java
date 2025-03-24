public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DataProcessor dataProcessor = new DataProcessor();

        queueManager.addToQueue(1);
        dataProcessor.processStrings();

        /* read */ int value = queueManager.takeFromQueue();
        System.out.println("Value read from the queue: " + value);

        for (int i = 0; i < 3; i++) {
            queueManager.addToQueue(i + 10);
        }
        while (true) {
            try {
                System.out.println("Remaining in queue: " + queueManager.takeFromQueue());
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}