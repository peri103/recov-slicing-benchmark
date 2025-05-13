import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setSize(1024);
        
        // Create an ArrayList to store TarArchiveEntry objects
        ArrayList<TarArchiveEntry> archiveList = new ArrayList<>();
        archiveList.add(entry);

        // Add more entries with different sizes
        TarArchiveEntry entry2 = new TarArchiveEntry("example2.txt");
        entry2.setSize(2048);
        archiveList.add(entry2);

        TarArchiveEntry entry3 = new TarArchiveEntry("example3.txt");
        entry3.setSize(4096);
        archiveList.add(entry3);

        // Print sizes of all entries in the archiveList
        for (TarArchiveEntry e : archiveList) {
            System.out.println("Entry: " + e.getName() + ", Size: " + e.getSize());
        }

        // Perform some calculations with sizes
        long totalSize = 0;
        for (TarArchiveEntry e : archiveList) {
            totalSize += e.getSize();
        }
        System.out.println("Total Size: " + totalSize);

        // Access the size of the original entry
        /* read */ long size = entry.getSize();
        System.out.println("Original Entry Size: " + size);

        // Create a list of sizes and calculate average size
        ArrayList<Long> sizes = new ArrayList<>();
        for (TarArchiveEntry e : archiveList) {
            sizes.add(e.getSize());
        }

        long averageSize = totalSize / sizes.size();
        System.out.println("Average Size: " + averageSize);
    }
}