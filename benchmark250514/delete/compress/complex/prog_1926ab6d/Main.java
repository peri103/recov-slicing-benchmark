import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize ZipArchiveEntry
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("initialName");
        
        // Initialize a list to store multiple ZipArchiveEntry objects
        ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();
        
        // Add the initial ZipArchiveEntry to the list
        zipEntries.add(zipEntry);
        
        // Create additional ZipArchiveEntry objects and add them to the list
        ZipArchiveEntry zipEntry2 = new ZipArchiveEntry("entry2");
        zipEntry2.setName("entry2Name");
        zipEntries.add(zipEntry2);
        
        ZipArchiveEntry zipEntry3 = new ZipArchiveEntry("entry3");
        zipEntry3.setName("entry3Name");
        zipEntries.add(zipEntry3);
        
        // Perform operations on the list
        for (ZipArchiveEntry entry : zipEntries) {
            System.out.println("Zip Entry Name: " + entry.getName());
        }
        
        // Set a new name for the first ZipArchiveEntry
        /* write */ zipEntry.setName("newName");
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Perform operations on the list again after the write operation
        for (ZipArchiveEntry entry : zipEntries) {
            System.out.println("Updated Zip Entry Name: " + entry.getName());
        }
        
        // Read the name from the first ZipArchiveEntry
        /* read */ String name = zipEntry.getName();
        
        // Print the name read from the ZipArchiveEntry
        System.out.println("Read Zip Entry Name: " + name);
        
        // Perform additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}