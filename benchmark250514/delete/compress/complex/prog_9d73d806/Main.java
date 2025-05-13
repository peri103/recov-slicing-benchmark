import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        CpioArchiveEntry anotherEntry = new CpioArchiveEntry("anotherFile.txt");
        
        /* write */ entry.setUserId(1001);
        
        // Additional complexity: Using a HashMap to store CpioArchiveEntry objects
        Map<String, CpioArchiveEntry> entryMap = new HashMap<>();
        entryMap.put("entry1", entry);
        entryMap.put("entry2", anotherEntry);
        
        // Setting other attributes for the entries
        anotherEntry.setMode(CpioConstants.C_ISREG);
        anotherEntry.setSize(2048);
        
        // Loop through the map and print details
        for (Map.Entry<String, CpioArchiveEntry> mapEntry : entryMap.entrySet()) {
            System.out.println("Key: " + mapEntry.getKey());
            System.out.println("File Name: " + mapEntry.getValue().getName());
            System.out.println("File Size: " + mapEntry.getValue().getSize());
        }
        
        // Calculate total size of all entries in the map
        long totalSize = 0;
        for (CpioArchiveEntry e : entryMap.values()) {
            totalSize += e.getSize();
        }
        System.out.println("Total Size: " + totalSize);
        
        /* read */ long userId = entry.getUserId();
        System.out.println("User ID: " + userId);
        
        // Additional complexity: Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);
        
        // Print a message based on condition
        if (sum > 100) {
            System.out.println("Sum is greater than 100");
        } else {
            System.out.println("Sum is less than or equal to 100");
        }
    }
}