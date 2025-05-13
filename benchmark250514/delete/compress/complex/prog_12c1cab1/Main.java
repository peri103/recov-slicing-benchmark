import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a new TarArchiveEntry object
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");

        // Set the modification time using the write method
        long modTime = System.currentTimeMillis();
        /* write */ entry.setModTime(modTime);

        // Create a map to store TarArchiveEntry objects with their names
        Map<String, TarArchiveEntry> entryMap = new HashMap<>();
        entryMap.put("example.txt", entry);

        // Add more entries to the map with different names
        TarArchiveEntry entry2 = new TarArchiveEntry("example2.txt");
        entry2.setModTime(modTime + 1000);
        entryMap.put("example2.txt", entry2);

        TarArchiveEntry entry3 = new TarArchiveEntry("example3.txt");
        entry3.setModTime(modTime + 2000);
        entryMap.put("example3.txt", entry3);

        // Perform some operations on the entries
        for (String name : entryMap.keySet()) {
            TarArchiveEntry currentEntry = entryMap.get(name);
            System.out.println("Entry Name: " + name);
            System.out.println("Modification Time: " + currentEntry.getModTime());
        }

        // Read the modification time using the read method
        /* read */ long readModTime = entry.getModTime();

        // Print the modification time to verify it was correctly set and read
        System.out.println("Modification Time of original entry: " + readModTime);

        // Perform a complex operation by calculating the sum of all modification times
        long totalModTime = 0;
        for (TarArchiveEntry e : entryMap.values()) {
            totalModTime += e.getModTime();
        }
        System.out.println("Total Modification Time: " + totalModTime);
    }
}