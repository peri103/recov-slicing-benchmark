import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry object
        TarArchiveEntry entry = new TarArchiveEntry("dummy");

        // Use the write method to set the size
        /* write */ entry.setSize(1024);

        // Create a list of TarArchiveEntry objects
        ArrayList<TarArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);
        
        // Create a HashMap to store some data
        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("entry1", 2048);
        dataMap.put("entry2", 4096);

        // Iterate over the HashMap and add new TarArchiveEntry objects to the list
        for (String key : dataMap.keySet()) {
            TarArchiveEntry newEntry = new TarArchiveEntry(key);
            newEntry.setSize(dataMap.get(key));
            entries.add(newEntry);
        }

        // Perform some operations with the entries
        for (TarArchiveEntry tarEntry : entries) {
            System.out.println("Entry Name: " + tarEntry.getName() + ", Size: " + tarEntry.getSize());
        }

        // Use the read method to get the size
        /* read */ long size = entry.getSize();

        // Print the size to verify that the read value is the same as the written value
        System.out.println("Original entry size: " + size);

        // Additional operations
        int totalSize = 0;
        for (TarArchiveEntry tarEntry : entries) {
            totalSize += tarEntry.getSize();
        }
        System.out.println("Total size of all entries: " + totalSize);
    }
}