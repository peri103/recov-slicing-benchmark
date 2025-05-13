import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        ArArchiveEntry anotherEntry = new ArArchiveEntry("example2.txt", 2000);

        /* write */ entry.setGroupId(12345);

        HashMap<String, Long> entryMap = new HashMap<>();
        entryMap.put(entry.getName(), entry.getSize());
        entryMap.put(anotherEntry.getName(), anotherEntry.getSize());

        long totalSize = 0;
        for (Long size : entryMap.values()) {
            totalSize += size;
        }

        System.out.println("Total size of entries: " + totalSize);

        ArArchiveOutputStream outputStream = null; // Simulated archive stream
        if (entryMap.containsKey("example.txt")) {
            // Simulate adding entry to archive
            System.out.println("Adding example.txt to archive.");
        }

        /* read */ long groupId = entry.getGroupId();
        System.out.println("Group ID of example.txt: " + groupId);

        if (entryMap.containsKey("example2.txt")) {
            // Simulate adding another entry to archive
            System.out.println("Adding example2.txt to archive.");
        }

        // Simulated operation on anotherEntry
        anotherEntry.setGroupId(67890);
        long anotherGroupId = anotherEntry.getGroupId();
        System.out.println("Group ID of example2.txt: " + anotherGroupId);
    }
}