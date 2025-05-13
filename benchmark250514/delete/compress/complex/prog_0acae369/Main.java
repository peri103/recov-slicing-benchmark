import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry object
        ArArchiveEntry archiveEntry = new ArArchiveEntry("example.txt", 1000);
        
        // Initialize a list to hold multiple archive entries
        ArrayList<ArArchiveEntry> archiveEntries = new ArrayList<>();
        
        // Add the entry to the list
        archiveEntries.add(archiveEntry);
        
        // Perform some operations with the list
        for (ArArchiveEntry entry : archiveEntries) {
            // Set the mode of each entry in the list
            entry.setMode(0644);
        }
        
        // Write operation: set the mode of the archive entry
        /* write */ archiveEntry.setMode(0755);

        // Perform some unrelated operations
        int totalSize = 0;
        for (ArArchiveEntry entry : archiveEntries) {
            totalSize += entry.getSize();
        }
        System.out.println("Total size of entries: " + totalSize);

        // Read operation: get the mode of the archive entry
        /* read */ int mode = archiveEntry.getMode();

        // Print the mode to verify it was set correctly
        System.out.println("Mode: " + mode);

        // Add more entries to the list
        ArArchiveEntry anotherEntry = new ArArchiveEntry("another.txt", 2000);
        archiveEntries.add(anotherEntry);

        // Iterate over the list again and print the name and size of each entry
        for (ArArchiveEntry entry : archiveEntries) {
            System.out.println("Entry: " + entry.getName() + ", Size: " + entry.getSize());
        }
    }
}