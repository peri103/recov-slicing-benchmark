import java.util.LinkedList;

public class MessageStorage {
    private LinkedList<String> messages = new LinkedList<>();

    public void storeMessage(String message) {
        /* write */ messages.addLast(message);
    }

    public String getLastMessage() {
        return messages.getLast();
    }
}
