import java.util.HashMap;
import java.util.Map;

public class FilePermissions {
    private Map<String, Integer> permissionsMap = new HashMap<>();

    public void addPermission(String fileName, int permission) {
        permissionsMap.put(fileName, permission);
    }

    public int getPermission(String fileName) {
        return permissionsMap.getOrDefault(fileName, 0);
    }

    public void printPermissions() {
        for (Map.Entry<String, Integer> entry : permissionsMap.entrySet()) {
            System.out.println("File: " + entry.getKey() + ", Permissions: " + entry.getValue());
        }
    }
}
