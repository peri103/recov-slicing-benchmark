import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("test", 0);
        ArrayList<ArArchiveEntry> archiveList = new ArrayList<>();
        
        // Add multiple entries to the list
        for (int i = 0; i < 5; i++) {
            ArArchiveEntry tempEntry = new ArArchiveEntry("entry" + i, i * 1000);
            archiveList.add(tempEntry);
        }
        
        // Perform operations on the list
        for (ArArchiveEntry arEntry : archiveList) {
            System.out.println("Entry Name: " + arEntry.getName() + ", Size: " + arEntry.getSize());
        }
        
        /* write */ entry.setSize(12345);
        
        // Perform some unrelated arithmetic operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Modify the list and perform more operations
        archiveList.add(entry);
        for (ArArchiveEntry arEntry : archiveList) {
            arEntry.setSize(arEntry.getSize() + 500);
        }
        
        // Retrieve size of the original entry
        /* read */ long size = entry.getSize();
        System.out.println("Original Entry Size: " + size);
        
        // Display updated sizes
        for (ArArchiveEntry arEntry : archiveList) {
            System.out.println("Updated Entry Name: " + arEntry.getName() + ", Updated Size: " + arEntry.getSize());
        }
    }
}