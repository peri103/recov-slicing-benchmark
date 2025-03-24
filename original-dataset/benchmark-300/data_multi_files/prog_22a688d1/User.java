public class User {
    private String name;
    private MessageQueue messageQueue;

    public User(String name, MessageQueue messageQueue) {
        this.name = name;
        this.messageQueue = messageQueue;
    }

    public void sendMessage(String message) throws InterruptedException {
        messageQueue.sendMessage(message);
    }

    public String receiveMessage() throws InterruptedException {
        return messageQueue.receiveMessage();
    }
}
