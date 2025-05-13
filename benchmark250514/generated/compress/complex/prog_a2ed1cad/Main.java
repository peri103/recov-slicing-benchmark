import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a ZipArchiveEntry
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        // Initialize extra data
        byte[] extraData = {0x01, 0x02, 0x03, 0x04};
        
        /* write */ zipEntry.setExtra(extraData);
        
        // Create a list of ZipArchiveEntries
        ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();
        zipEntries.add(zipEntry);
        
        // Create a map to store file names and their corresponding entry objects
        HashMap<String, ZipArchiveEntry> entryMap = new HashMap<>();
        entryMap.put(zipEntry.getName(), zipEntry);
        
        // Process the entries and perform some operations
        for (ZipArchiveEntry entry : zipEntries) {
            System.out.println("Processing entry: " + entry.getName());
            // Simulate some operations on the entry
            byte[] data = entryMap.get(entry.getName()).getExtra();
            if (data != null) {
                for (byte b : data) {
                    System.out.print(b + " ");
                }
                System.out.println();
            }
        }
        
        // Create another ZipArchiveEntry
        ZipArchiveEntry anotherEntry = new ZipArchiveEntry("another_example.txt");
        byte[] anotherExtraData = {0x05, 0x06};
        anotherEntry.setExtra(anotherExtraData);
        zipEntries.add(anotherEntry);
        
        // Perform some unrelated complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Retrieve and print the extra data from the original entry
        /* read */ byte[] readData = zipEntry.getExtra();
        
        // Print the read data
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}