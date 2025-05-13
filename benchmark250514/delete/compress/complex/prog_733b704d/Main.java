import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        ArrayList<String> groupNames = new ArrayList<>();
        groupNames.add("user");
        groupNames.add("guest");
        
        Map<String, Integer> groupPermissions = new HashMap<>();
        groupPermissions.put("admin", 777);
        groupPermissions.put("user", 755);
        groupPermissions.put("guest", 644);

        /* write */ entry.setGroupName("admin");

        for (String group : groupNames) {
            int permission = groupPermissions.get(group);
            System.out.println("Group: " + group + ", Permission: " + permission);
        }
        
        String selectedGroup = groupNames.get(1);
        System.out.println("Selected Group: " + selectedGroup);

        /* read */ String groupName = entry.getGroupName();
        System.out.println("Entry Group Name: " + groupName);

        int adminPermission = groupPermissions.get(groupName);
        System.out.println("Admin Permission: " + adminPermission);

        for (Map.Entry<String, Integer> entrySet : groupPermissions.entrySet()) {
            System.out.println("Group: " + entrySet.getKey() + ", Permission: " + entrySet.getValue());
        }
    }
}