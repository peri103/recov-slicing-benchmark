public class User {
    private String name;
    private MessageStorage storage = new MessageStorage();

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        storage.storeMessage(message);
    }

    public String getLastMessage() {
        return storage.getLastMessage();
    }
}
