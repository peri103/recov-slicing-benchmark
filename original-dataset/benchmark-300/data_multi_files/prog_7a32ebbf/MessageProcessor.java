public class MessageProcessor {
    private MessageQueue messageQueue;

    public MessageProcessor(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void processMessage() throws InterruptedException {
        int message = messageQueue.receiveMessage();
        System.out.println("Processed message: " + message);
    }
}
