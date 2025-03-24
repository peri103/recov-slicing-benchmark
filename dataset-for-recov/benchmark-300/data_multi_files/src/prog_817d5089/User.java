public class User {
    private String name;
    private MessageQueue messageQueue = new MessageQueue();

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        messageQueue.addMessage(message);
    }

    public String receiveLastMessage() {
        return messageQueue.getLastMessage();
    }
}
