public class User {
    private String name;
    private MessageQueue messageQueue;

    public User(String name, MessageQueue messageQueue) {
        this.name = name;
        this.messageQueue = messageQueue;
    }

    public void sendMessage(int message) throws InterruptedException {
        messageQueue.sendMessage(message);
    }

    public int receiveMessage() throws InterruptedException {
        return messageQueue.receiveMessage();
    }
}
