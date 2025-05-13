import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.HashMap;

public class UserPermissions {
    private HashMap<String, Integer> userPermissions = new HashMap<>();
    private DumpArchiveEntry entry = new DumpArchiveEntry();

    public UserPermissions() {
        // Initialize user permissions
        userPermissions.put("admin", 777);
        userPermissions.put("guest", 100);
        userPermissions.put("user", 500);
    }

    public void setPermissionForRole(String role) {
        if (userPermissions.containsKey(role)) {
            int permissionLevel = userPermissions.get(role);
            /* write */ entry.setGroupId(permissionLevel);
        }
    }

    public DumpArchiveEntry getEntry() {
        return entry;
    }

    public HashMap<String, Integer> getUserPermissions() {
        return userPermissions;
    }
}
