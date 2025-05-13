import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("initialName", 100);

        // Creating a map to store archive entries
        Map<String, ArArchiveEntry> archiveMap = new HashMap<>();
        archiveMap.put("entry1", entry);

        // Adding another entry to the map
        ArArchiveEntry anotherEntry = new ArArchiveEntry("secondEntry", 200);
        anotherEntry.setName("secondEntryUpdated");
        archiveMap.put("entry2", anotherEntry);

        // Performing some operations on the map
        for (Map.Entry<String, ArArchiveEntry> mapEntry : archiveMap.entrySet()) {
            System.out.println("Key: " + mapEntry.getKey() + ", Size: " + mapEntry.getValue().getLength());
        }

        // Modifying the original entry name
        /* write */ entry.setName("newName");

        // Performing additional operations
        int totalSize = 0;
        for (ArArchiveEntry arEntry : archiveMap.values()) {
            totalSize += arEntry.getLength();
        }
        System.out.println("Total size of all entries: " + totalSize);

        // Reading the name from the original entry
        /* read */ String name = entry.getName();
        System.out.println("Name of the original entry: " + name);

        // Further operations to increase complexity
        for (int i = 0; i < 3; i++) {
            ArArchiveEntry tempEntry = new ArArchiveEntry("tempEntry" + i, 50 + i * 10);
            archiveMap.put("temp" + i, tempEntry);
        }

        for (Map.Entry<String, ArArchiveEntry> mapEntry : archiveMap.entrySet()) {
            System.out.println("Final Key: " + mapEntry.getKey() + ", Final Name: " + mapEntry.getValue().getName());
        }
    }
}