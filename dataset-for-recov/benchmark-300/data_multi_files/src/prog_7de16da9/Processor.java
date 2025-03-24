public class Processor {
    private QueueManager queueManager;

    public Processor(QueueManager queueManager) {
        this.queueManager = queueManager;
    }

    public void process() throws InterruptedException {
        int value = queueManager.takeValue();
        System.out.println("Processed value: " + value);
    }
}
