public class Consumer {
    private QueueManager queueManager;

    public Consumer(QueueManager queueManager) {
        this.queueManager = queueManager;
    }

    public void consume() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            int num = queueManager.takeValue();
            System.out.println("Consumed: " + num);
            Thread.sleep(300); // Simulate time taken to consume
        }
    }
}
