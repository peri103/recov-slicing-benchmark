import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        HashMap<String, Long> groupIdMap = new HashMap<>();
        groupIdMap.put("entry1", 67890L);
        groupIdMap.put("entry2", 54321L);

        /* write */ entry.setGroupId(12345L);

        // Perform some unrelated operations
        for (String key : groupIdMap.keySet()) {
            System.out.println("Group ID for " + key + ": " + groupIdMap.get(key));
        }

        // More complex operations
        long totalGroupId = 0;
        for (Long value : groupIdMap.values()) {
            totalGroupId += value;
        }
        System.out.println("Total Group ID: " + totalGroupId);

        // Further operations
        CpioArchiveEntry anotherEntry = new CpioArchiveEntry("anotherTest");
        anotherEntry.setGroupId(99999L);
        System.out.println("Another Entry Group ID: " + anotherEntry.getGroupId());

        /* read */ long groupId = entry.getGroupId();
        System.out.println(groupId);
        
        // Additional operations
        HashMap<String, CpioArchiveEntry> entryMap = new HashMap<>();
        entryMap.put("entry1", entry);
        entryMap.put("entry2", anotherEntry);

        for (String entryKey : entryMap.keySet()) {
            System.out.println("Entry Key: " + entryKey + ", Group ID: " + entryMap.get(entryKey).getGroupId());
        }
    }
}