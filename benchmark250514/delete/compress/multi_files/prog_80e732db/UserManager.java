import java.util.ArrayList;

public class UserManager {
    private ArrayList<String> userNames = new ArrayList<>();

    public void addUserName(String userName) {
        userNames.add(userName);
    }

    public void removeUserName(String userName) {
        userNames.remove(userName);
    }

    public ArrayList<String> getUserNames() {
        return userNames;
    }
}
