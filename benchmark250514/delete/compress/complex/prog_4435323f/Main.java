import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CpioArchiveEntry
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile", 1000);
        /* write */ entry.setMode(644);

        // Create a map to store file entries and modes
        Map<String, Integer> fileModeMap = new HashMap<>();
        fileModeMap.put(entry.getName(), entry.getMode());

        // Add more entries to the map
        CpioArchiveEntry entry2 = new CpioArchiveEntry("anotherfile", 2000);
        entry2.setMode(CpioConstants.C_ISREG);
        fileModeMap.put(entry2.getName(), entry2.getMode());

        // Perform operations on the map
        for (Map.Entry<String, Integer> fileEntry : fileModeMap.entrySet()) {
            System.out.println("File: " + fileEntry.getKey() + " Mode: " + fileEntry.getValue());
        }

        // Calculate total mode values
        int totalMode = 0;
        for (int mode : fileModeMap.values()) {
            totalMode += mode;
        }
        System.out.println("Total Mode Value: " + totalMode);

        // Retrieve and print the mode of the original entry
        /* read */ int mode = entry.getMode();
        System.out.println("Mode of 'testfile': " + mode);

        // Perform more operations
        CpioArchiveEntry entry3 = new CpioArchiveEntry("thirdfile", 3000);
        entry3.setMode(CpioConstants.C_ISDIR);
        fileModeMap.put(entry3.getName(), entry3.getMode());

        // Print all entries again
        for (Map.Entry<String, Integer> fileEntry : fileModeMap.entrySet()) {
            System.out.println("File: " + fileEntry.getKey() + " Mode: " + fileEntry.getValue());
        }
    }
}