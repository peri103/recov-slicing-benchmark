import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry with a given name
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");

        // Create a map to store file names and their sizes
        Map<String, Long> fileSizeMap = new HashMap<>();
        fileSizeMap.put("example.txt", 512L);
        fileSizeMap.put("sample.txt", 2048L);

        // Simulate some operations on the map
        if (fileSizeMap.containsKey("example.txt")) {
            System.out.println("example.txt size before setting: " + fileSizeMap.get("example.txt"));
        }

        // Set the size of the TarArchiveEntry
        /* write */ tarEntry.setSize(1024);

        // Perform additional operations
        fileSizeMap.put("example.txt", tarEntry.getSize());

        // Simulate some calculations
        long totalSize = 0;
        for (Long size : fileSizeMap.values()) {
            totalSize += size;
        }
        System.out.println("Total size of files: " + totalSize);

        // Retrieve the size of the TarArchiveEntry
        /* read */ long size = tarEntry.getSize();

        // Print the size of the TarArchiveEntry
        System.out.println("Size of example.txt after setting: " + size);
    }
}