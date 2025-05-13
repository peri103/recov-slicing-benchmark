import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        /* write */ entry.setUserId(12345);
        
        // Create a map to store file entries and their user ids
        HashMap<String, Integer> fileUserMap = new HashMap<>();
        fileUserMap.put(entry.getName(), entry.getUserId());

        // Create another entry and add it to the map
        ArArchiveEntry entry2 = new ArArchiveEntry("another.txt", 200);
        entry2.setUserId(67890);
        fileUserMap.put(entry2.getName(), entry2.getUserId());

        // Create a list to store archive entries
        ArrayList<ArArchiveEntry> archiveList = new ArrayList<>();
        archiveList.add(entry);
        archiveList.add(entry2);

        // Simulate adding entries to an archive output stream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ArArchiveOutputStream aos = new ArArchiveOutputStream(baos);
        for (ArArchiveEntry e : archiveList) {
            try {
                aos.putArchiveEntry(e);
                aos.closeArchiveEntry();
            } catch (Exception ex) {
                System.out.println("Error processing entry: " + e.getName());
            }
        }
        
        // Retrieve and print userId for the original entry
        /* read */ int userId = entry.getUserId();
        System.out.println("User ID for " + entry.getName() + ": " + userId);

        // Print all entries and their user ids
        for (String fileName : fileUserMap.keySet()) {
            System.out.println("File: " + fileName + ", User ID: " + fileUserMap.get(fileName));
        }
    }
}