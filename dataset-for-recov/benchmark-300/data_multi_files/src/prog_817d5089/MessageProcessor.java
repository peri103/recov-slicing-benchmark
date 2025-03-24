public class MessageProcessor {
    private MessageQueue messageQueue;

    public MessageProcessor(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void processMessage(String message) {
        messageQueue.addMessage(message);
    }

    public String retrieveLastMessage() {
        return messageQueue.getLastMessage();
    }
}
