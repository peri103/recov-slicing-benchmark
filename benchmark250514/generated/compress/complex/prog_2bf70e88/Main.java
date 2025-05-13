import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a ZipArchiveEntry
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        
        // Initialize a HashMap to store various comments for different entries
        HashMap<String, String> entryComments = new HashMap<>();
        
        // Initialize an ArrayList to store multiple entries
        ArrayList<ZipArchiveEntry> entries = new ArrayList<>();
        
        // Add the entry to the list
        entries.add(entry);
        
        // Set a comment for the entry
        /* write */ entry.setComment("This is a comment");
        
        // Store the comment in the HashMap
        entryComments.put(entry.getName(), entry.getComment());
        
        // Add more entries with different comments
        ZipArchiveEntry entry2 = new ZipArchiveEntry("example2.txt");
        entry2.setComment("Second comment");
        entries.add(entry2);
        entryComments.put(entry2.getName(), entry2.getComment());
        
        ZipArchiveEntry entry3 = new ZipArchiveEntry("example3.txt");
        entry3.setComment("Third comment");
        entries.add(entry3);
        entryComments.put(entry3.getName(), entry3.getComment());
        
        // Iterate over all entries and print their comments
        for (ZipArchiveEntry e : entries) {
            System.out.println("Entry: " + e.getName() + ", Comment: " + entryComments.get(e.getName()));
        }
        
        // Retrieve the comment from the original entry
        /* read */ String comment = entry.getComment();
        
        // Print the comment retrieved from the original entry
        System.out.println("Retrieved Comment: " + comment);
        
        // Additional logic to manipulate entries
        for (ZipArchiveEntry e : entries) {
            if (e.getName().equals("example2.txt")) {
                System.out.println("Special handling for example2.txt");
            }
        }
    }
}