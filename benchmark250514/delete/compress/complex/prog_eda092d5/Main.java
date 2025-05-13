import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        long currentTime = System.currentTimeMillis();
        
        /* write */ entry.setLastModified(currentTime);
        
        // Additional code to make the program more complex
        ArrayList<ArArchiveEntry> archiveList = new ArrayList<>();
        archiveList.add(entry);

        ArArchiveEntry anotherEntry = new ArArchiveEntry("another.txt", 2000);
        anotherEntry.setLastModified(currentTime - 10000);
        archiveList.add(anotherEntry);

        for (ArArchiveEntry archiveEntry : archiveList) {
            System.out.println("Archive Entry: " + archiveEntry.getName() + ", Size: " + archiveEntry.getSize());
        }

        // Perform some operations
        long totalSize = 0;
        for (ArArchiveEntry archiveEntry : archiveList) {
            totalSize += archiveEntry.getSize();
        }
        System.out.println("Total Size of Archives: " + totalSize);

        // More operations
        if (totalSize > 1500) {
            System.out.println("Total size exceeds 1500.");
        } else {
            System.out.println("Total size is within limit.");
        }

        /* read */ long lastModified = entry.getLastModified();
        
        System.out.println("Last Modified Time of 'example.txt': " + lastModified);
    }
}