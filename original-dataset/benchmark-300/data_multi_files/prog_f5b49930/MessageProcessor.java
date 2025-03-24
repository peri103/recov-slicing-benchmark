public class MessageProcessor {
    private MessageQueue messageQueue;

    public MessageProcessor(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void processMessage() {
        String message = messageQueue.getFirstMessage();
        System.out.println("Processed Message: " + message);
    }
}
