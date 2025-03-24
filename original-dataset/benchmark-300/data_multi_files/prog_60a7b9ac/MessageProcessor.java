public class MessageProcessor {
    private MessageQueue messageQueue;

    public MessageProcessor(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void processMessages() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            messageQueue.sendMessage(i * 10);
        }
    }
}
