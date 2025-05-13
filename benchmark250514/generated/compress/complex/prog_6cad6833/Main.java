import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("dummy");
        
        // Create a list of TarArchiveEntries
        ArrayList<TarArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);

        // Create a map to store link names with their respective entries
        HashMap<TarArchiveEntry, String> linkNameMap = new HashMap<>();
        
        // Set link name for the entry
        /* write */ entry.setLinkName("exampleLink");
        
        // Add link names to the map
        for (TarArchiveEntry e : entries) {
            linkNameMap.put(e, e.getLinkName());
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Retrieve and print the link name
        /* read */ String linkName = entry.getLinkName();
        System.out.println("Link Name: " + linkName);

        // Print all link names from the map
        for (TarArchiveEntry e : linkNameMap.keySet()) {
            System.out.println("Entry: " + e.getName() + ", Link Name: " + linkNameMap.get(e));
        }

        // Perform some more unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}