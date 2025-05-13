import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("", 0);
        ArrayList<ArArchiveEntry> archiveList = new ArrayList<>();
        
        // Create multiple entries and add to the list
        ArArchiveEntry entry1 = new ArArchiveEntry("entry1", 100);
        ArArchiveEntry entry2 = new ArArchiveEntry("entry2", 200);
        archiveList.add(entry1);
        archiveList.add(entry2);

        // Perform operations on the list
        for (ArArchiveEntry arEntry : archiveList) {
            System.out.println("Archive Entry Name: " + arEntry.getName());
        }

        /* write */ entry.setName("exampleName");
        
        // More operations with the list
        archiveList.add(entry);
        for (ArArchiveEntry arEntry : archiveList) {
            System.out.println("Archive Entry Size: " + arEntry.getLength());
        }
        
        /* read */ String name = entry.getName();
        System.out.println("Final Entry Name: " + name);

        // Additional operations
        int totalSize = 0;
        for (ArArchiveEntry arEntry : archiveList) {
            totalSize += arEntry.getLength();
        }
        System.out.println("Total Archive Size: " + totalSize);
    }
}