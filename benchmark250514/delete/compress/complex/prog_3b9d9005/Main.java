import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create an ArArchiveEntry object
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);

        // Create a map to store file entries with their last modified times
        HashMap<String, Long> fileMap = new HashMap<>();
        
        // Create a list to store file names
        ArrayList<String> fileList = new ArrayList<>();
        
        // Add some file names to the list
        fileList.add("example.txt");
        fileList.add("another_example.txt");

        // Set last modified time for the entry
        /* write */ entry.setLastModified(123456789L);

        // Process each file in the list
        for (String fileName : fileList) {
            if (fileName.equals("example.txt")) {
                // Add the last modified time to the map
                fileMap.put(fileName, entry.getLastModified());
            } else {
                // Add a default last modified time for other files
                fileMap.put(fileName, 987654321L);
            }
        }

        // Perform some complex operations with the map
        long totalModifiedTime = 0;
        for (Long modifiedTime : fileMap.values()) {
            totalModifiedTime += modifiedTime;
        }

        // Retrieve the last modified time from the entry
        /* read */ long lastModified = entry.getLastModified();
        System.out.println("Last Modified Time of example.txt: " + lastModified);

        // Print out the total modified time of all files
        System.out.println("Total Modified Time: " + totalModifiedTime);

        // Additional complex logic: calculate average modified time
        double averageModifiedTime = totalModifiedTime / (double) fileMap.size();
        System.out.println("Average Modified Time: " + averageModifiedTime);
    }
}