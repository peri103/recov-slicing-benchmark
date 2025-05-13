import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private int id;
    private DumpArchiveEntryWrapper entryWrapper;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
        this.entryWrapper = new DumpArchiveEntryWrapper();
    }

    public void assignUserIdInEntry(int userId) {
        entryWrapper.setUserId(userId);
    }

    public int retrieveUserIdFromEntry() {
        return entryWrapper.getUserId();
    }

    public static void printUserDetails(Map<String, Integer> userMap) {
        for (Map.Entry<String, Integer> user : userMap.entrySet()) {
            System.out.println("User: " + user.getKey() + ", ID: " + user.getValue());
        }
    }
}