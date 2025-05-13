import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example");
        Map<String, TarArchiveEntry> archiveMap = new HashMap<>();
        archiveMap.put("entry1", entry);

        // Additional code to make the program more complex
        TarArchiveEntry entry2 = new TarArchiveEntry("example2");
        entry2.setUserId(2002);
        archiveMap.put("entry2", entry2);

        for (Map.Entry<String, TarArchiveEntry> mapEntry : archiveMap.entrySet()) {
            System.out.println("Processing: " + mapEntry.getKey());
            if (mapEntry.getValue().getUserId() == 2002) {
                System.out.println("User ID for entry2 is 2002");
            }
        }

        /* write */ entry.setGroupId(1001);

        // More complex logic
        TarArchiveEntry entry3 = new TarArchiveEntry("example3");
        entry3.setUserId(3003);
        entry3.setGroupId(2002);
        archiveMap.put("entry3", entry3);

        for (Map.Entry<String, TarArchiveEntry> mapEntry : archiveMap.entrySet()) {
            long groupId = mapEntry.getValue().getGroupId();
            System.out.println("Group ID for " + mapEntry.getKey() + ": " + groupId);
        }

        // Final read operation
        /* read */ long groupId = entry.getGroupId();
        System.out.println("Group ID for entry1: " + groupId);
    }
}