import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        
        // Initialize a list of entries
        ArrayList<ArArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);
        
        // Create another entry and add it to the list
        ArArchiveEntry entry2 = new ArArchiveEntry("example2.txt", 2000);
        entry2.setUserId(54321);
        entries.add(entry2);

        // Use ArArchiveOutputStream to simulate archive operations
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ArArchiveOutputStream arOut = new ArArchiveOutputStream(baos);
        
        // Write the entries to the archive output stream
        for (ArArchiveEntry e : entries) {
            try {
                arOut.putArchiveEntry(e);
                arOut.closeArchiveEntry();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        // Set user ID for the first entry
        /* write */ entry.setUserId(12345);
        
        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Access the user ID of the first entry
        /* read */ long userId = entry.getUserId();
        System.out.println("User ID of first entry: " + userId);
        
        // Print the user IDs of all entries
        for (ArArchiveEntry e : entries) {
            System.out.println("Entry: " + e.getName() + ", User ID: " + e.getUserId());
        }
    }
}