import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a DumpArchiveEntry object
        DumpArchiveEntry entry = new DumpArchiveEntry();

        // Initialize a list to hold multiple DumpArchiveEntry objects
        List<DumpArchiveEntry> entries = new ArrayList<>();
        
        // Add the entry to the list
        entries.add(entry);

        // Set external attributes using the write method
        /* write */ entry.setExternalAttributes(12345);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Initialize another DumpArchiveEntry object and set attributes
        DumpArchiveEntry anotherEntry = new DumpArchiveEntry();
        anotherEntry.setExternalAttributes(67890);
        entries.add(anotherEntry);

        // Perform operations on the list of entries
        long totalAttributes = 0;
        for (DumpArchiveEntry e : entries) {
            totalAttributes += e.getExternalAttributes();
        }
        System.out.println("Total external attributes: " + totalAttributes);

        // Read external attributes using the read method
        /* read */ long externalAttributes = entry.getExternalAttributes();

        // Print the read value to verify
        System.out.println("External attributes of the first entry: " + externalAttributes);
    }
}