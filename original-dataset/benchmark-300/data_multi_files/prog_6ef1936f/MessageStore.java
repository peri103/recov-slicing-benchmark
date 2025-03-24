import java.util.HashSet;

public class MessageStore {
    private HashSet<String> messages = new HashSet<>();

    public void addMessage(String message) {
        /* write */ messages.add(message);
    }

    public boolean containsMessage(String message) {
        return messages.contains(message);
    }
}
