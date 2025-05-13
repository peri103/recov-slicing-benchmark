import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        List<DumpArchiveEntry> entryList = new ArrayList<>();
        Map<String, Long> crcMap = new HashMap<>();

        // Set CRC for the entry and add it to the list
        /* write */ entry.setCrc(12345L);
        entryList.add(entry);

        // Create another entry and set different CRC
        DumpArchiveEntry anotherEntry = new DumpArchiveEntry();
        anotherEntry.setCrc(67890L);
        entryList.add(anotherEntry);

        // Store CRC values in a map
        for (DumpArchiveEntry e : entryList) {
            crcMap.put("Entry" + entryList.indexOf(e), e.getCrc());
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Retrieve and print the CRC value of the first entry
        /* read */ long crcValue = entry.getCrc();
        System.out.println("CRC of the first entry: " + crcValue);

        // Print all CRC values stored in the map
        for (Map.Entry<String, Long> entrySet : crcMap.entrySet()) {
            System.out.println("CRC Value for " + entrySet.getKey() + ": " + entrySet.getValue());
        }
    }
}